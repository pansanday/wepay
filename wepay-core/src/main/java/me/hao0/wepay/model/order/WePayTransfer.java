package me.hao0.wepay.model.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import me.hao0.wepay.model.enums.TradeState;
import me.hao0.wepay.model.enums.WepayField;
import me.hao0.wepay.serializer.TradeStateDeserializer;

import java.io.Serializable;

/**
 * 企业付款查询对象
 *
 * @author pansanday
 * @date 2018/2/8 17:41
 * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/tools/mch_pay.php?chapter=14_3">查询企业付款</a>
 */
public class WePayTransfer implements Serializable {

    /**
     * 商户使用查询API填写的单号的原路返回
     */
    @JsonProperty(WepayField.PARTNER_TRADE_NO)
    private String partnerTradeNo;

    /**
     * 微信支付分配的商户号
     */
    @JsonProperty(WepayField.MCH_ID)
    private String mchId;

    /**
     * 调用企业付款API时，微信系统内部产生的单号
     */
    @JsonProperty(WepayField.DETAIL_ID)
    private String detailId;

    /**
     * 调用企业付款API时，微信系统内部产生的单号
     */
    @JsonProperty(WepayField.STATUS)
    @JsonDeserialize(using = TradeStateDeserializer.class)
    private TradeState status;

    /**
     * 如果失败则有失败原因
     */
    @JsonProperty(WepayField.REASON)
    private String reason;

    /**
     * 用户openId
     */
    @JsonProperty(WepayField.OPEN_ID)
    private String openId;

    /**
     * 收款用户姓名
     */
    @JsonProperty(WepayField.TRANSFER_NAME)
    private String transferName;

    /**
     * 发起转账的时间
     */
    @JsonProperty(WepayField.PAYMENT_AMOUNT)
    private String paymentAmount;

    /**
     * 发起转账的时间
     */
    @JsonProperty(WepayField.TRANSFER_TIME)
    private String transferTime;

    /**
     * 企业付款成功时间
     */
    @JsonProperty(WepayField.PAYMENT_TIME)
    private String paymentTime;

    /**
     * 付款时候的描述
     */
    @JsonProperty(WepayField.DESC)
    private String desc;

    public String getPartnerTradeNo() {
        return partnerTradeNo;
    }

    public void setPartnerTradeNo(String partnerTradeNo) {
        this.partnerTradeNo = partnerTradeNo;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    public TradeState getStatus() {
        return status;
    }

    public void setStatus(TradeState status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getTransferName() {
        return transferName;
    }

    public void setTransferName(String transferName) {
        this.transferName = transferName;
    }

    public String getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getTransferTime() {
        return transferTime;
    }

    public void setTransferTime(String transferTime) {
        this.transferTime = transferTime;
    }

    public String getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "WePayTransfer{" +
                "partnerTradeNo='" + partnerTradeNo + '\'' +
                ", mchId='" + mchId + '\'' +
                ", detailId='" + detailId + '\'' +
                ", status=" + status +
                ", reason='" + reason + '\'' +
                ", openId='" + openId + '\'' +
                ", transferName='" + transferName + '\'' +
                ", paymentAmount='" + paymentAmount + '\'' +
                ", transferTime='" + transferTime + '\'' +
                ", paymentTime='" + paymentTime + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}