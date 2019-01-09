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


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_9708_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	
	public HD_AFFR_9708_LDM(){}
	public HD_AFFR_9708_LDM(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_9708_L(? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_9708_LDM dm = (HD_AFFR_9708_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_9708_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String mang_no = req.getParameter("mang_no");
if( mang_no == null){
	System.out.println(this.toString+" : mang_no is null" );
}else{
	System.out.println(this.toString+" : mang_no is "+mang_no );
}
String memb_clsf = req.getParameter("memb_clsf");
if( memb_clsf == null){
	System.out.println(this.toString+" : memb_clsf is null" );
}else{
	System.out.println(this.toString+" : memb_clsf is "+memb_clsf );
}
String expn_clsf_cd = req.getParameter("expn_clsf_cd");
if( expn_clsf_cd == null){
	System.out.println(this.toString+" : expn_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : expn_clsf_cd is "+expn_clsf_cd );
}
String stlm_desty = req.getParameter("stlm_desty");
if( stlm_desty == null){
	System.out.println(this.toString+" : stlm_desty is null" );
}else{
	System.out.println(this.toString+" : stlm_desty is "+stlm_desty );
}
String reg_sdt = req.getParameter("reg_sdt");
if( reg_sdt == null){
	System.out.println(this.toString+" : reg_sdt is null" );
}else{
	System.out.println(this.toString+" : reg_sdt is "+reg_sdt );
}
String reg_edt = req.getParameter("reg_edt");
if( reg_edt == null){
	System.out.println(this.toString+" : reg_edt is null" );
}else{
	System.out.println(this.toString+" : reg_edt is "+reg_edt );
}
String pay_sdt = req.getParameter("pay_sdt");
if( pay_sdt == null){
	System.out.println(this.toString+" : pay_sdt is null" );
}else{
	System.out.println(this.toString+" : pay_sdt is "+pay_sdt );
}
String pay_edt = req.getParameter("pay_edt");
if( pay_edt == null){
	System.out.println(this.toString+" : pay_edt is null" );
}else{
	System.out.println(this.toString+" : pay_edt is "+pay_edt );
}
String spos_yn = req.getParameter("spos_yn");
if( spos_yn == null){
	System.out.println(this.toString+" : spos_yn is null" );
}else{
	System.out.println(this.toString+" : spos_yn is "+spos_yn );
}
String dth_yn = req.getParameter("dth_yn");
if( dth_yn == null){
	System.out.println(this.toString+" : dth_yn is null" );
}else{
	System.out.println(this.toString+" : dth_yn is "+dth_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mang_no = Util.checkString(req.getParameter("mang_no"));
String memb_clsf = Util.checkString(req.getParameter("memb_clsf"));
String expn_clsf_cd = Util.checkString(req.getParameter("expn_clsf_cd"));
String stlm_desty = Util.checkString(req.getParameter("stlm_desty"));
String reg_sdt = Util.checkString(req.getParameter("reg_sdt"));
String reg_edt = Util.checkString(req.getParameter("reg_edt"));
String pay_sdt = Util.checkString(req.getParameter("pay_sdt"));
String pay_edt = Util.checkString(req.getParameter("pay_edt"));
String spos_yn = Util.checkString(req.getParameter("spos_yn"));
String dth_yn = Util.checkString(req.getParameter("dth_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_no")));
String memb_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("memb_clsf")));
String expn_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("expn_clsf_cd")));
String stlm_desty = Util.Uni2Ksc(Util.checkString(req.getParameter("stlm_desty")));
String reg_sdt = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_sdt")));
String reg_edt = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_edt")));
String pay_sdt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_sdt")));
String pay_edt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_edt")));
String spos_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("spos_yn")));
String dth_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("dth_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMang_no(mang_no);
dm.setMemb_clsf(memb_clsf);
dm.setExpn_clsf_cd(expn_clsf_cd);
dm.setStlm_desty(stlm_desty);
dm.setReg_sdt(reg_sdt);
dm.setReg_edt(reg_edt);
dm.setPay_sdt(pay_sdt);
dm.setPay_edt(pay_edt);
dm.setSpos_yn(spos_yn);
dm.setDth_yn(dth_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 26 15:18:22 KST 2017 */