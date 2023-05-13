// pages/home/home.js
Page({

    /**
     * 页面的初始数据
     */
    data: {
        //存放轮播图数组
        swiperList:[]
        //存放9宫格数据
        ,gridList:[]
    },

    /**
     * 生命周期函数--监听页面加载
     */
    onLoad(options) {
        this.getSwiperList();
        this.getGridList();
    },

    getSwiperList(){
        wx.request({
          url: 'https://www.escook.cn/slides'
          ,"method":"GET"
          ,success:(res)=>{
              this.setData(
                  {
                      swiperList:res.data
                  }
              )
          }
 
        })
    },
    //获取9宫格数据的方法
    getGridList(){
        wx.request({
          url: 'https://www.escook.cn/categories',
          method:'GET'
          ,success:(res)=>{
            //console.info(res)
            var data=res.data;
            data[0].name="核酸检测"
            data[1].name="撸代码"
            data[2].name="撸代码"
            data[3].name="撸代码"
            data[4].name="撸代码"
            data[5].name="吃面"
            data[6].name="撸代码"
            data[7].name="撸代码"
            data[8].name="睡觉"
            this.setData({
                gridList:res.data
            })
          }
        })
    },

    /**
     * 生命周期函数--监听页面初次渲染完成
     */
    onReady() {

    },

    /**
     * 生命周期函数--监听页面显示
     */
    onShow() {

    },

    /**
     * 生命周期函数--监听页面隐藏
     */
    onHide() {

    },

    /**
     * 生命周期函数--监听页面卸载
     */
    onUnload() {

    },

    /**
     * 页面相关事件处理函数--监听用户下拉动作
     */
    onPullDownRefresh() {

    },

    /**
     * 页面上拉触底事件的处理函数
     */
    onReachBottom() {

    },

    /**
     * 用户点击右上角分享
     */
    onShareAppMessage() {

    }
})