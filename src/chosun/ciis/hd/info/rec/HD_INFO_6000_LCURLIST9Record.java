/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_6000_LCURLIST9Record extends java.lang.Object implements java.io.Serializable{

	public String prtct_obj_clsf_cd;
	public String prtct_obj_clsf_nm;
	public String prtct_obj_pers_no;
	public String prtct_grad_cd;
	public String prtct_grad_nm;
	public String prtct_obj_relatn;
	public String prtct_obj_relatn_rshp_cd;
	public String prtct_obj_relatn_rshp_nm;
	public String prtct_appmt_ofbld_cd;
	public String prtct_appmt_ofbld_nm;

	public HD_INFO_6000_LCURLIST9Record(){}

	public void setPrtct_obj_clsf_cd(String prtct_obj_clsf_cd){
		this.prtct_obj_clsf_cd = prtct_obj_clsf_cd;
	}

	public void setPrtct_obj_clsf_nm(String prtct_obj_clsf_nm){
		this.prtct_obj_clsf_nm = prtct_obj_clsf_nm;
	}

	public void setPrtct_obj_pers_no(String prtct_obj_pers_no){
		this.prtct_obj_pers_no = prtct_obj_pers_no;
	}

	public void setPrtct_grad_cd(String prtct_grad_cd){
		this.prtct_grad_cd = prtct_grad_cd;
	}

	public void setPrtct_grad_nm(String prtct_grad_nm){
		this.prtct_grad_nm = prtct_grad_nm;
	}

	public void setPrtct_obj_relatn(String prtct_obj_relatn){
		this.prtct_obj_relatn = prtct_obj_relatn;
	}

	public void setPrtct_obj_relatn_rshp_cd(String prtct_obj_relatn_rshp_cd){
		this.prtct_obj_relatn_rshp_cd = prtct_obj_relatn_rshp_cd;
	}

	public void setPrtct_obj_relatn_rshp_nm(String prtct_obj_relatn_rshp_nm){
		this.prtct_obj_relatn_rshp_nm = prtct_obj_relatn_rshp_nm;
	}

	public void setPrtct_appmt_ofbld_cd(String prtct_appmt_ofbld_cd){
		this.prtct_appmt_ofbld_cd = prtct_appmt_ofbld_cd;
	}

	public void setPrtct_appmt_ofbld_nm(String prtct_appmt_ofbld_nm){
		this.prtct_appmt_ofbld_nm = prtct_appmt_ofbld_nm;
	}

	public String getPrtct_obj_clsf_cd(){
		return this.prtct_obj_clsf_cd;
	}

	public String getPrtct_obj_clsf_nm(){
		return this.prtct_obj_clsf_nm;
	}

	public String getPrtct_obj_pers_no(){
		return this.prtct_obj_pers_no;
	}

	public String getPrtct_grad_cd(){
		return this.prtct_grad_cd;
	}

	public String getPrtct_grad_nm(){
		return this.prtct_grad_nm;
	}

	public String getPrtct_obj_relatn(){
		return this.prtct_obj_relatn;
	}

	public String getPrtct_obj_relatn_rshp_cd(){
		return this.prtct_obj_relatn_rshp_cd;
	}

	public String getPrtct_obj_relatn_rshp_nm(){
		return this.prtct_obj_relatn_rshp_nm;
	}

	public String getPrtct_appmt_ofbld_cd(){
		return this.prtct_appmt_ofbld_cd;
	}

	public String getPrtct_appmt_ofbld_nm(){
		return this.prtct_appmt_ofbld_nm;
	}
}

/* 작성시간 : Thu Aug 09 16:35:29 KST 2018 */