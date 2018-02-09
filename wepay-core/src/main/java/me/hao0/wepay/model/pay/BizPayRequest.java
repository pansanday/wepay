package me.hao0.wepay.model.pay;

import me.hao0.wepay.annotation.Optional;
import me.hao0.wepay.model.enums.NameCheckType;

/**
 * 企业付款请求对象
 *
 * @author pansanday
 * @date 2018/2/7 14:13
 */
public class BizPayRequest extends PayRequest {

    /**
     * 商户账号appid
     * {@link me.hao0.wepay.model.enums.WepayField#MCH_APPID}
     */
    private String mchAppid;

    /**
     * 商户号
     * {@link me.hao0.wepay.model.enums.WepayField#MCHID}
     */
    private String mchid;

    /**
     * 随机字符串，不长于32位
     * {@link me.hao0.wepay.model.enums.WepayField#NONCE_STR}
     */
    private String nonceStr;

    /**
     * 签名
     * {@link me.hao0.wepay.model.enums.WepayField#SIGN}
     */
    private String sign;

    /**
     * 商户订单号，需保持唯一性; (只能是字母或者数字，不能包含有符号)
     * {@link me.hao0.wepay.model.enums.WepayField#PARTNER_TRADE_NO}
     */
    private String partnerTradeNo;

    /**
     * 用户标识
     * {@link me.hao0.wepay.model.enums.WepayField#OPEN_ID}
     */
    private String openId;

    /**
     * 校验用户姓名选项
     * NO_CHECK：不校验真实姓名; FORCE_CHECK：强校验真实姓名
     * {@link me.hao0.wepay.model.enums.WepayField#CHECK_NAME}
     */
    private NameCheckType checkName = NameCheckType.NO_CHECK;

    /**
     * 收款用户真实姓名
     * 如果check_name设置为FORCE_CHECK，则必填用户真实姓名
     * {@link me.hao0.wepay.model.enums.WepayField#RE_USER_NAME}
     */
    @Optional(any = false)
    private String reUserName;

    /**
     * 企业付款金额，单位为分
     * {@link me.hao0.wepay.model.enums.WepayField#AMOUNT}
     */
    private Integer amount;

    /**
     * 企业付款描述信息
     * {@link me.hao0.wepay.model.enums.WepayField#DESC}
     */
    private String desc;

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

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getPartnerTradeNo() {
        return partnerTradeNo;
    }

    public void setPartnerTradeNo(String partnerTradeNo) {
        this.partnerTradeNo = partnerTradeNo;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public NameCheckType getCheckName() {
        return checkName;
    }

    public void setCheckName(NameCheckType checkName) {
        this.checkName = checkName;
    }

    public String getReUserName() {
        return reUserName;
    }

    public void setReUserName(String reUserName) {
        this.reUserName = reUserName;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "BizPayRequest{" +
                "mchAppid='" + mchAppid + '\'' +
                ", mchid='" + mchid + '\'' +
                ", nonceStr='" + nonceStr + '\'' +
                ", sign='" + sign + '\'' +
                ", partnerTradeNo='" + partnerTradeNo + '\'' +
                ", openId='" + openId + '\'' +
                ", checkName=" + checkName +
                ", reUserName='" + reUserName + '\'' +
                ", amount=" + amount +
                ", desc='" + desc + '\'' +
                '}';
    }
}