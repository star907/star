package com.star.web.admin.pojo.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 角色
 *
 * @author star926
 * @since 2022-06-16
 */
@Data
@TableName("sys_user_role")
public class SysUserRole implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 用户ID
	 */
	private Long userId;

	/**
	 * 角色ID
	 */
	private Long roleId;

}