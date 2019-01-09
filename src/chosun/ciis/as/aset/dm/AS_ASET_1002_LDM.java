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


package chosun.ciis.as.aset.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.aset.ds.*;
import chosun.ciis.as.aset.rec.*;

/**
 * 
 */


public class AS_ASET_1002_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fr_aset_no;
	public String to_aset_no;
	public String buy_clsf;
	public String fr_dlco_ern;
	public String to_dlco_ern;
	public String fr_dept_cd;
	public String to_dept_cd;
	public String fr_acqr_dt;
	public String to_acqr_dt;
	public String fr_acqr_amt;
	public String to_acqr_amt;

	public AS_ASET_1002_LDM(){}
	public AS_ASET_1002_LDM(String cmpy_cd, String fr_aset_no, String to_aset_no, String buy_clsf, String fr_dlco_ern, String to_dlco_ern, String fr_dept_cd, String to_dept_cd, String fr_acqr_dt, String to_acqr_dt, String fr_acqr_amt, String to_acqr_amt){
		this.cmpy_cd = cmpy_cd;
		this.fr_aset_no = fr_aset_no;
		this.to_aset_no = to_aset_no;
		this.buy_clsf = buy_clsf;
		this.fr_dlco_ern = fr_dlco_ern;
		this.to_dlco_ern = to_dlco_ern;
		this.fr_dept_cd = fr_dept_cd;
		this.to_dept_cd = to_dept_cd;
		this.fr_acqr_dt = fr_acqr_dt;
		this.to_acqr_dt = to_acqr_dt;
		this.fr_acqr_amt = fr_acqr_amt;
		this.to_acqr_amt = to_acqr_amt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFr_aset_no(String fr_aset_no){
		this.fr_aset_no = fr_aset_no;
	}

	public void setTo_aset_no(String to_aset_no){
		this.to_aset_no = to_aset_no;
	}

	public void setBuy_clsf(String buy_clsf){
		this.buy_clsf = buy_clsf;
	}

	public void setFr_dlco_ern(String fr_dlco_ern){
		this.fr_dlco_ern = fr_dlco_ern;
	}

	public void setTo_dlco_ern(String to_dlco_ern){
		this.to_dlco_ern = to_dlco_ern;
	}

	public void setFr_dept_cd(String fr_dept_cd){
		this.fr_dept_cd = fr_dept_cd;
	}

	public void setTo_dept_cd(String to_dept_cd){
		this.to_dept_cd = to_dept_cd;
	}

	public void setFr_acqr_dt(String fr_acqr_dt){
		this.fr_acqr_dt = fr_acqr_dt;
	}

	public void setTo_acqr_dt(String to_acqr_dt){
		this.to_acqr_dt = to_acqr_dt;
	}

	public void setFr_acqr_amt(String fr_acqr_amt){
		this.fr_acqr_amt = fr_acqr_amt;
	}

	public void setTo_acqr_amt(String to_acqr_amt){
		this.to_acqr_amt = to_acqr_amt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFr_aset_no(){
		return this.fr_aset_no;
	}

	public String getTo_aset_no(){
		return this.to_aset_no;
	}

	public String getBuy_clsf(){
		return this.buy_clsf;
	}

	public String getFr_dlco_ern(){
		return this.fr_dlco_ern;
	}

	public String getTo_dlco_ern(){
		return this.to_dlco_ern;
	}

	public String getFr_dept_cd(){
		return this.fr_dept_cd;
	}

	public String getTo_dept_cd(){
		return this.to_dept_cd;
	}

	public String getFr_acqr_dt(){
		return this.fr_acqr_dt;
	}

	public String getTo_acqr_dt(){
		return this.to_acqr_dt;
	}

	public String getFr_acqr_amt(){
		return this.fr_acqr_amt;
	}

	public String getTo_acqr_amt(){
		return this.to_acqr_amt;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_ASET_1002_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_ASET_1002_LDM dm = (AS_ASET_1002_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fr_aset_no);
		cstmt.setString(5, dm.to_aset_no);
		cstmt.setString(6, dm.buy_clsf);
		cstmt.setString(7, dm.fr_dlco_ern);
		cstmt.setString(8, dm.to_dlco_ern);
		cstmt.setString(9, dm.fr_dept_cd);
		cstmt.setString(10, dm.to_dept_cd);
		cstmt.setString(11, dm.fr_acqr_dt);
		cstmt.setString(12, dm.to_acqr_dt);
		cstmt.setString(13, dm.fr_acqr_amt);
		cstmt.setString(14, dm.to_acqr_amt);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.aset.ds.AS_ASET_1002_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fr_aset_no = [" + getFr_aset_no() + "]");
		System.out.println("to_aset_no = [" + getTo_aset_no() + "]");
		System.out.println("buy_clsf = [" + getBuy_clsf() + "]");
		System.out.println("fr_dlco_ern = [" + getFr_dlco_ern() + "]");
		System.out.println("to_dlco_ern = [" + getTo_dlco_ern() + "]");
		System.out.println("fr_dept_cd = [" + getFr_dept_cd() + "]");
		System.out.println("to_dept_cd = [" + getTo_dept_cd() + "]");
		System.out.println("fr_acqr_dt = [" + getFr_acqr_dt() + "]");
		System.out.println("to_acqr_dt = [" + getTo_acqr_dt() + "]");
		System.out.println("fr_acqr_amt = [" + getFr_acqr_amt() + "]");
		System.out.println("to_acqr_amt = [" + getTo_acqr_amt() + "]");
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
String fr_aset_no = req.getParameter("fr_aset_no");
if( fr_aset_no == null){
	System.out.println(this.toString+" : fr_aset_no is null" );
}else{
	System.out.println(this.toString+" : fr_aset_no is "+fr_aset_no );
}
String to_aset_no = req.getParameter("to_aset_no");
if( to_aset_no == null){
	System.out.println(this.toString+" : to_aset_no is null" );
}else{
	System.out.println(this.toString+" : to_aset_no is "+to_aset_no );
}
String buy_clsf = req.getParameter("buy_clsf");
if( buy_clsf == null){
	System.out.println(this.toString+" : buy_clsf is null" );
}else{
	System.out.println(this.toString+" : buy_clsf is "+buy_clsf );
}
String fr_dlco_ern = req.getParameter("fr_dlco_ern");
if( fr_dlco_ern == null){
	System.out.println(this.toString+" : fr_dlco_ern is null" );
}else{
	System.out.println(this.toString+" : fr_dlco_ern is "+fr_dlco_ern );
}
String to_dlco_ern = req.getParameter("to_dlco_ern");
if( to_dlco_ern == null){
	System.out.println(this.toString+" : to_dlco_ern is null" );
}else{
	System.out.println(this.toString+" : to_dlco_ern is "+to_dlco_ern );
}
String fr_dept_cd = req.getParameter("fr_dept_cd");
if( fr_dept_cd == null){
	System.out.println(this.toString+" : fr_dept_cd is null" );
}else{
	System.out.println(this.toString+" : fr_dept_cd is "+fr_dept_cd );
}
String to_dept_cd = req.getParameter("to_dept_cd");
if( to_dept_cd == null){
	System.out.println(this.toString+" : to_dept_cd is null" );
}else{
	System.out.println(this.toString+" : to_dept_cd is "+to_dept_cd );
}
String fr_acqr_dt = req.getParameter("fr_acqr_dt");
if( fr_acqr_dt == null){
	System.out.println(this.toString+" : fr_acqr_dt is null" );
}else{
	System.out.println(this.toString+" : fr_acqr_dt is "+fr_acqr_dt );
}
String to_acqr_dt = req.getParameter("to_acqr_dt");
if( to_acqr_dt == null){
	System.out.println(this.toString+" : to_acqr_dt is null" );
}else{
	System.out.println(this.toString+" : to_acqr_dt is "+to_acqr_dt );
}
String fr_acqr_amt = req.getParameter("fr_acqr_amt");
if( fr_acqr_amt == null){
	System.out.println(this.toString+" : fr_acqr_amt is null" );
}else{
	System.out.println(this.toString+" : fr_acqr_amt is "+fr_acqr_amt );
}
String to_acqr_amt = req.getParameter("to_acqr_amt");
if( to_acqr_amt == null){
	System.out.println(this.toString+" : to_acqr_amt is null" );
}else{
	System.out.println(this.toString+" : to_acqr_amt is "+to_acqr_amt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fr_aset_no = Util.checkString(req.getParameter("fr_aset_no"));
String to_aset_no = Util.checkString(req.getParameter("to_aset_no"));
String buy_clsf = Util.checkString(req.getParameter("buy_clsf"));
String fr_dlco_ern = Util.checkString(req.getParameter("fr_dlco_ern"));
String to_dlco_ern = Util.checkString(req.getParameter("to_dlco_ern"));
String fr_dept_cd = Util.checkString(req.getParameter("fr_dept_cd"));
String to_dept_cd = Util.checkString(req.getParameter("to_dept_cd"));
String fr_acqr_dt = Util.checkString(req.getParameter("fr_acqr_dt"));
String to_acqr_dt = Util.checkString(req.getParameter("to_acqr_dt"));
String fr_acqr_amt = Util.checkString(req.getParameter("fr_acqr_amt"));
String to_acqr_amt = Util.checkString(req.getParameter("to_acqr_amt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fr_aset_no = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_aset_no")));
String to_aset_no = Util.Uni2Ksc(Util.checkString(req.getParameter("to_aset_no")));
String buy_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("buy_clsf")));
String fr_dlco_ern = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_dlco_ern")));
String to_dlco_ern = Util.Uni2Ksc(Util.checkString(req.getParameter("to_dlco_ern")));
String fr_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_dept_cd")));
String to_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("to_dept_cd")));
String fr_acqr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_acqr_dt")));
String to_acqr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_acqr_dt")));
String fr_acqr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_acqr_amt")));
String to_acqr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_acqr_amt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFr_aset_no(fr_aset_no);
dm.setTo_aset_no(to_aset_no);
dm.setBuy_clsf(buy_clsf);
dm.setFr_dlco_ern(fr_dlco_ern);
dm.setTo_dlco_ern(to_dlco_ern);
dm.setFr_dept_cd(fr_dept_cd);
dm.setTo_dept_cd(to_dept_cd);
dm.setFr_acqr_dt(fr_acqr_dt);
dm.setTo_acqr_dt(to_acqr_dt);
dm.setFr_acqr_amt(fr_acqr_amt);
dm.setTo_acqr_amt(to_acqr_amt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Oct 08 14:54:51 KST 2015 */