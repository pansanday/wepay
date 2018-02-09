package me.hao0.wepay.core;

import me.hao0.wepay.model.enums.WepayField;
import me.hao0.wepay.model.order.WePayTransfer;
import me.hao0.wepay.util.RandomStrs;

import java.util.Map;
import java.util.TreeMap;

import static me.hao0.common.util.Preconditions.checkNotNullAndEmpty;

/**
 * 企业付款组件
 *
 * @author pansanday
 * @date 2018/2/9 11:15
 */
public final class Transfer extends Component {

    /**
     * 查询企业付款到零钱
     */
    private static final String BIZ2BALANCE_QUERY = "https://api.mch.weixin.qq.com/mmpaymkttransfers/gettransferinfo";

    protected Transfer(Wepay wepay) {
        super(wepay);
    }

    /**
     * 根据商户订单号查询企业付款
     *
     * @param partnerTradeNo 商户调用企业付款API时使用的商户订单号
     * @return WePayTransfer对象，或抛WepayException
     */
    public WePayTransfer queryByPartnerTradeNo(String partnerTradeNo) {
        checkNotNullAndEmpty(partnerTradeNo, "partnerTradeNo");
        Map<String, String> queryParams = new TreeMap<>();
        put(queryParams, WepayField.PARTNER_TRADE_NO, partnerTradeNo);
        buildQueryParams(queryParams);

        return doHttpsPost(BIZ2BALANCE_QUERY, queryParams, WePayTransfer.class, false);
    }

    /**
     * 构建查询订单参数
     *
     * @param queryParams 查询参数
     */
    private void buildQueryParams(Map<String, String> queryParams) {
        buildConfigParams(queryParams);
        put(queryParams, WepayField.NONCE_STR, RandomStrs.generate(16));
        buildSignParams(queryParams);
    }
}
