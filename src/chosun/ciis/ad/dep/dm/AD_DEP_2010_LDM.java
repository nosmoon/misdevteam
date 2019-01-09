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


package chosun.ciis.ad.dep.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.dep.ds.*;
import chosun.ciis.ad.dep.rec.*;

/**
 * 
 */


public class AD_DEP_2010_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String acct_num;
	public String frdt;
	public String todt;
	public String remark;
	public String tran_amt;
	public String rcpm_proc_yn;

	public AD_DEP_2010_LDM(){}
	public AD_DEP_2010_LDM(String cmpy_cd, String acct_num, String frdt, String todt, String remark, String tran_amt, String rcpm_proc_yn){
		this.cmpy_cd = cmpy_cd;
		this.acct_num = acct_num;
		this.frdt = frdt;
		this.todt = todt;
		this.remark = remark;
		this.tran_amt = tran_amt;
		this.rcpm_proc_yn = rcpm_proc_yn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAcct_num(String acct_num){
		this.acct_num = acct_num;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setRemark(String remark){
		this.remark = remark;
	}

	public void setTran_amt(String tran_amt){
		this.tran_amt = tran_amt;
	}

	public void setRcpm_proc_yn(String rcpm_proc_yn){
		this.rcpm_proc_yn = rcpm_proc_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAcct_num(){
		return this.acct_num;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getRemark(){
		return this.remark;
	}

	public String getTran_amt(){
		return this.tran_amt;
	}

	public String getRcpm_proc_yn(){
		return this.rcpm_proc_yn;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_DEP_2010_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_DEP_2010_LDM dm = (AD_DEP_2010_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.acct_num);
		cstmt.setString(5, dm.frdt);
		cstmt.setString(6, dm.todt);
		cstmt.setString(7, dm.remark);
		cstmt.setString(8, dm.tran_amt);
		cstmt.setString(9, dm.rcpm_proc_yn);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.dep.ds.AD_DEP_2010_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("acct_num = [" + getAcct_num() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("remark = [" + getRemark() + "]");
		System.out.println("tran_amt = [" + getTran_amt() + "]");
		System.out.println("rcpm_proc_yn = [" + getRcpm_proc_yn() + "]");
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
String acct_num = req.getParameter("acct_num");
if( acct_num == null){
	System.out.println(this.toString+" : acct_num is null" );
}else{
	System.out.println(this.toString+" : acct_num is "+acct_num );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String remark = req.getParameter("remark");
if( remark == null){
	System.out.println(this.toString+" : remark is null" );
}else{
	System.out.println(this.toString+" : remark is "+remark );
}
String tran_amt = req.getParameter("tran_amt");
if( tran_amt == null){
	System.out.println(this.toString+" : tran_amt is null" );
}else{
	System.out.println(this.toString+" : tran_amt is "+tran_amt );
}
String rcpm_proc_yn = req.getParameter("rcpm_proc_yn");
if( rcpm_proc_yn == null){
	System.out.println(this.toString+" : rcpm_proc_yn is null" );
}else{
	System.out.println(this.toString+" : rcpm_proc_yn is "+rcpm_proc_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String acct_num = Util.checkString(req.getParameter("acct_num"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String remark = Util.checkString(req.getParameter("remark"));
String tran_amt = Util.checkString(req.getParameter("tran_amt"));
String rcpm_proc_yn = Util.checkString(req.getParameter("rcpm_proc_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String acct_num = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_num")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String remark = Util.Uni2Ksc(Util.checkString(req.getParameter("remark")));
String tran_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_amt")));
String rcpm_proc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_proc_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAcct_num(acct_num);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setRemark(remark);
dm.setTran_amt(tran_amt);
dm.setRcpm_proc_yn(rcpm_proc_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 24 10:32:08 KST 2009 */