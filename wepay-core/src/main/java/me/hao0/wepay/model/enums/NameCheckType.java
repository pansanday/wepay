package me.hao0.wepay.model.enums;

/**
 * 校验用户姓名选项
 *
 * @author pansanday
 * @date 2018/2/8 15:41
 * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/tools/mch_pay.php?chapter=14_2">校验用户姓名选项</a>
 */
public enum NameCheckType {
    /**
     * 不校验真实姓名
     */
    NO_CHECK("NO_CHECK"),

    /**
     * 强校验真实姓名
     */
    FORCE_CHECK("FORCE_CHECK");

    private String type;

    NameCheckType(String type) {
        this.type = type;
    }

    public String type() {
        return type;
    }

    public static NameCheckType from(String t) {
        for (NameCheckType nct : NameCheckType.values()) {
            if (nct.type().equals(t)) {
                return nct;
            }
        }
        throw new IllegalArgumentException("unknown name check option: " + t);
    }
}
