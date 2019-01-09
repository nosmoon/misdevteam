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


public class HD_AFFR_9701_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mang_no;
	public String memb_clsf;
	public String expn_clsf_cd;
	public String stlm_desty;
	public String reg_sdt;
	public String reg_edt;
	public String pay_sdt;
	public String pay_edt;
	public String spos_yn;
	public String dth_yn;

	public HD_AFFR_9701_LDM(){}
	public HD_AFFR_9701_LDM(String cmpy_cd, String mang_no, String memb_clsf, String expn_clsf_cd, String stlm_desty, String reg_sdt, String reg_edt, String pay_sdt, String pay_edt, String spos_yn, String dth_yn){
		this.cmpy_cd = cmpy_cd;
		this.mang_no = mang_no;
		this.memb_clsf = memb_clsf;
		this.expn_clsf_cd = expn_clsf_cd;
		this.stlm_desty = stlm_desty;
		this.reg_sdt = reg_sdt;
		this.reg_edt = reg_edt;
		this.pay_sdt = pay_sdt;
		this.pay_edt = pay_edt;
		this.spos_yn = spos_yn;
		this.dth_yn = dth_yn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setMemb_clsf(String memb_clsf){
		this.memb_clsf = memb_clsf;
	}

	public void setExpn_clsf_cd(String expn_clsf_cd){
		this.expn_clsf_cd = expn_clsf_cd;
	}

	public void setStlm_desty(String stlm_desty){
		this.stlm_desty = stlm_desty;
	}

	public void setReg_sdt(String reg_sdt){
		this.reg_sdt = reg_sdt;
	}

	public void setReg_edt(String reg_edt){
		this.reg_edt = reg_edt;
	}

	public void setPay_sdt(String pay_sdt){
		this.pay_sdt = pay_sdt;
	}

	public void setPay_edt(String pay_edt){
		this.pay_edt = pay_edt;
	}

	public void setSpos_yn(String spos_yn){
		this.spos_yn = spos_yn;
	}

	public void setDth_yn(String dth_yn){
		this.dth_yn = dth_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getMemb_clsf(){
		return this.memb_clsf;
	}

	public String getExpn_clsf_cd(){
		return this.expn_clsf_cd;
	}

	public String getStlm_desty(){
		return this.stlm_desty;
	}

	public String getReg_sdt(){
		return this.reg_sdt;
	}

	public String getReg_edt(){
		return this.reg_edt;
	}

	public String getPay_sdt(){
		return this.pay_sdt;
	}

	public String getPay_edt(){
		return this.pay_edt;
	}

	public String getSpos_yn(){
		return this.spos_yn;
	}

	public String getDth_yn(){
		return this.dth_yn;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_9701_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_9701_LDM dm = (HD_AFFR_9701_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mang_no);
		cstmt.setString(5, dm.memb_clsf);
		cstmt.setString(6, dm.expn_clsf_cd);
		cstmt.setString(7, dm.stlm_desty);
		cstmt.setString(8, dm.reg_sdt);
		cstmt.setString(9, dm.reg_edt);
		cstmt.setString(10, dm.pay_sdt);
		cstmt.setString(11, dm.pay_edt);
		cstmt.setString(12, dm.spos_yn);
		cstmt.setString(13, dm.dth_yn);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_9701_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mang_no = [" + getMang_no() + "]");
		System.out.println("memb_clsf = [" + getMemb_clsf() + "]");
		System.out.println("expn_clsf_cd = [" + getExpn_clsf_cd() + "]");
		System.out.println("stlm_desty = [" + getStlm_desty() + "]");
		System.out.println("reg_sdt = [" + getReg_sdt() + "]");
		System.out.println("reg_edt = [" + getReg_edt() + "]");
		System.out.println("pay_sdt = [" + getPay_sdt() + "]");
		System.out.println("pay_edt = [" + getPay_edt() + "]");
		System.out.println("spos_yn = [" + getSpos_yn() + "]");
		System.out.println("dth_yn = [" + getDth_yn() + "]");
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