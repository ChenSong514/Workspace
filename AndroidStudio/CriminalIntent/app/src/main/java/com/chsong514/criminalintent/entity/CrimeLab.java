package com.chsong514.criminalintent.entity;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by chsong514 on 2021/9/28.
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;

    private CrimeLab(Context context) {
            mCrimes=new ArrayList<>();
        for(int i =0;i<100;i++){
            Crime crime=new Crime();
            crime.setTitle("Crime #"+i);
            crime.setSolved(i%2==0);
            mCrimes.add(crime);
        }
    }

    public static CrimeLab get(Context context){
        if(sCrimeLab==null){
            sCrimeLab=new CrimeLab(context);
        }
        return sCrimeLab;
    }
    public Crime getCrime(UUID id){
        for (Crime crime:mCrimes){
            if(crime.getId().equals(id)){
                return crime;
            }
        }
        return null;
    }
}
