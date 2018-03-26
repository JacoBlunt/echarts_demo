package com.jaco9.echarts_demo.basic_demo.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 111
 * </p>
 *
 * @author yi.zhang
 * @since 2018-03-26
 */
@TableName("JS_RK_SZ_DAY")
public class JsRkSzDay extends Model<JsRkSzDay> {

    private static final long serialVersionUID = 1L;

    /**
     * 11
     */
	@TableId("id")
	protected Long id;
	@TableField("NF")
	private String nf;
	@TableField("RKRQ")
	private String rkrq;
	@TableField("SWJG_DM")
	private String swjgDm;
	@TableField("GDSLX_DM")
	private String gdslxDm;
	@TableField("ZSXM_DM")
	private String zsxmDm;
	@TableField("ZSXMMC")
	private String zsxmmc;
	@TableField("RKJE")
	private Double rkje;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNf() {
		return nf;
	}

	public void setNf(String nf) {
		this.nf = nf;
	}

	public String getRkrq() {
		return rkrq;
	}

	public void setRkrq(String rkrq) {
		this.rkrq = rkrq;
	}

	public String getSwjgDm() {
		return swjgDm;
	}

	public void setSwjgDm(String swjgDm) {
		this.swjgDm = swjgDm;
	}

	public String getGdslxDm() {
		return gdslxDm;
	}

	public void setGdslxDm(String gdslxDm) {
		this.gdslxDm = gdslxDm;
	}

	public String getZsxmDm() {
		return zsxmDm;
	}

	public void setZsxmDm(String zsxmDm) {
		this.zsxmDm = zsxmDm;
	}

	public String getZsxmmc() {
		return zsxmmc;
	}

	public void setZsxmmc(String zsxmmc) {
		this.zsxmmc = zsxmmc;
	}

	public Double getRkje() {
		return rkje;
	}

	public void setRkje(Double rkje) {
		this.rkje = rkje;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "JsRkSzDay{" +
			", id=" + id +
			", nf=" + nf +
			", rkrq=" + rkrq +
			", swjgDm=" + swjgDm +
			", gdslxDm=" + gdslxDm +
			", zsxmDm=" + zsxmDm +
			", zsxmmc=" + zsxmmc +
			", rkje=" + rkje +
			"}";
	}
}
