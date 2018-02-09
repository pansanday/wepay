package me.hao0.wepay.model.pay;

import com.fasterxml.jackson.annotation.JsonProperty;
import me.hao0.wepay.annotation.Optional;
import me.hao0.wepay.model.enums.WepayField;

import java.io.Serializable;

/**
 * 企业付款到零钱响应对象
 *
 * @author pansanday
 * @date 2018/2/8 14:57
 * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/tools/mch_pay.php?chapter=14_2">响应对象</a>
 */
public class BizPayResponse implements Serializable {

    /**
     * 申请商户号的appid或商户号绑定的appid（企业号corpid即为此appId）
     */
    @JsonProperty(WepayField.MCH_APPID)
    private String mchAppid;

    /**
     * 微信支付分配的商户号
     */
    @JsonProperty(WepayField.MCHID)
    private String mchid;

    /**
     * 设备号
     */
    @Optional
    @JsonProperty(WepayField.DEVICE_INFO)
    private String deviceInfo;

    /**
     * 随机字符串
     */
    @JsonProperty(WepayField.NONCE_STR)
    private String nonceStr;

    /**
     * 商户订单号，需保持唯一性 (只能是字母或者数字，不能包含有符号)
     */
    @JsonProperty(WepayField.PARTNER_TRADE_NO)
    private String partnerTradeNo;

    /**
     * 企业付款成功，返回的微信订单号
     */
    @JsonProperty(WepayField.PAYMENT_NO)
    private String paymentNo;

    /**
     * 企业付款成功时间
     */
    @JsonProperty(WepayField.PAYMENT_TIME)
    private String paymentTime;

    public String getMchAppid() {
        return mchAppid;
    }

    public void setMchAppid(String mchAppid) {
        this.mchAppid = mchAppid;
    }

    public String getMchid() {
        return mchid;
    }

    public void setMchid(String mchid) {
        this.mchid = mchid;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getPartnerTradeNo() {
        return partnerTradeNo;
    }

    public void setPartnerTradeNo(String partnerTradeNo) {
        this.partnerTradeNo = partnerTradeNo;
    }

    public String getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
    }

    public String getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
    }

    @Override
    public String toString() {
        return "BizPayResponse{" +
                "mchAppid='" + mchAppid + '\'' +
                ", mchid='" + mchid + '\'' +
                ", deviceInfo='" + deviceInfo + '\'' +
                ", nonceStr='" + nonceStr + '\'' +
                ", partnerTradeNo='" + partnerTradeNo + '\'' +
                ", paymentNo='" + paymentNo + '\'' +
                ", paymentTime='" + paymentTime + '\'' +
                '}';
    }
}
