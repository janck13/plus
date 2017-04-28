package net.lvddy.pojo.po;



import lombok.Data;

import java.util.Date;

/**
 * Created by kcz-020 on 2017/4/27.
 */
@Data
public class WechatUser {

    private Long id;

    private String openId;

    private String nickname;

    private String head;

    private String area;

    private String state;

    private Date createTime;

    private Date updateTime;
}
