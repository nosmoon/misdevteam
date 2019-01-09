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


package chosun.ciis.mc.budg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.ds.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_6058_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public long brlen;
	public String brzero;
	public long bulen;
	public String buzero;
	public String atms;
	public String btms;
	public String budg_yymm;
	public String dept_cd;
	public long start_len1;
	public long end_len1;
	public String cond1;
	public long start_len2;
	public long end_len2;
	public String cond2;

	public MC_BUDG_6058_LDM(){}
	public MC_BUDG_6058_LDM(String cmpy_cd, long brlen, String brzero, long bulen, String buzero, String atms, String btms, String budg_yymm, String dept_cd, long start_len1, long end_len1, String cond1, long start_len2, long end_len2, String cond2){
		this.cmpy_cd = cmpy_cd;
		this.brlen = brlen;
		this.brzero = brzero;
		this.bulen = bulen;
		this.buzero = buzero;
		this.atms = atms;
		this.btms = btms;
		this.budg_yymm = budg_yymm;
		this.dept_cd = dept_cd;
		this.start_len1 = start_len1;
		this.end_len1 = end_len1;
		this.cond1 = cond1;
		this.start_len2 = start_len2;
		this.end_len2 = end_len2;
		this.cond2 = cond2;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBrlen(long brlen){
		this.brlen = brlen;
	}

	public void setBrzero(String brzero){
		this.brzero = brzero;
	}

	public void setBulen(long bulen){
		this.bulen = bulen;
	}

	public void setBuzero(String buzero){
		this.buzero = buzero;
	}

	public void setAtms(String atms){
		this.atms = atms;
	}

	public void setBtms(String btms){
		this.btms = btms;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setStart_len1(long start_len1){
		this.start_len1 = start_len1;
	}

	public void setEnd_len1(long end_len1){
		this.end_len1 = end_len1;
	}

	public void setCond1(String cond1){
		this.cond1 = cond1;
	}

	public void setStart_len2(long start_len2){
		this.start_len2 = start_len2;
	}

	public void setEnd_len2(long end_len2){
		this.end_len2 = end_len2;
	}

	public void setCond2(String cond2){
		this.cond2 = cond2;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public long getBrlen(){
		return this.brlen;
	}

	public String getBrzero(){
		return this.brzero;
	}

	public long getBulen(){
		return this.bulen;
	}

	public String getBuzero(){
		return this.buzero;
	}

	public String getAtms(){
		return this.atms;
	}

	public String getBtms(){
		return this.btms;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public long getStart_len1(){
		return this.start_len1;
	}

	public long getEnd_len1(){
		return this.end_len1;
	}

	public String getCond1(){
		return this.cond1;
	}

	public long getStart_len2(){
		return this.start_len2;
	}

	public long getEnd_len2(){
		return this.end_len2;
	}

	public String getCond2(){
		return this.cond2;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_6058_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_6058_LDM dm = (MC_BUDG_6058_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setLong(4, dm.brlen);
		cstmt.setString(5, dm.brzero);
		cstmt.setLong(6, dm.bulen);
		cstmt.setString(7, dm.buzero);
		cstmt.setString(8, dm.atms);
		cstmt.setString(9, dm.btms);
		cstmt.setString(10, dm.budg_yymm);
		cstmt.setString(11, dm.dept_cd);
		cstmt.setLong(12, dm.start_len1);
		cstmt.setLong(13, dm.end_len1);
		cstmt.setString(14, dm.cond1);
		cstmt.setLong(15, dm.start_len2);
		cstmt.setLong(16, dm.end_len2);
		cstmt.setString(17, dm.cond2);
		cstmt.registerOutParameter(18, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_6058_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("brlen = [" + getBrlen() + "]");
		System.out.println("brzero = [" + getBrzero() + "]");
		System.out.println("bulen = [" + getBulen() + "]");
		System.out.println("buzero = [" + getBuzero() + "]");
		System.out.println("atms = [" + getAtms() + "]");
		System.out.println("btms = [" + getBtms() + "]");
		System.out.println("budg_yymm = [" + getBudg_yymm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("start_len1 = [" + getStart_len1() + "]");
		System.out.println("end_len1 = [" + getEnd_len1() + "]");
		System.out.println("cond1 = [" + getCond1() + "]");
		System.out.println("start_len2 = [" + getStart_len2() + "]");
		System.out.println("end_len2 = [" + getEnd_len2() + "]");
		System.out.println("cond2 = [" + getCond2() + "]");
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
String brlen = req.getParameter("brlen");
if( brlen == null){
	System.out.println(this.toString+" : brlen is null" );
}else{
	System.out.println(this.toString+" : brlen is "+brlen );
}
String brzero = req.getParameter("brzero");
if( brzero == null){
	System.out.println(this.toString+" : brzero is null" );
}else{
	System.out.println(this.toString+" : brzero is "+brzero );
}
String bulen = req.getParameter("bulen");
if( bulen == null){
	System.out.println(this.toString+" : bulen is null" );
}else{
	System.out.println(this.toString+" : bulen is "+bulen );
}
String buzero = req.getParameter("buzero");
if( buzero == null){
	System.out.println(this.toString+" : buzero is null" );
}else{
	System.out.println(this.toString+" : buzero is "+buzero );
}
String atms = req.getParameter("atms");
if( atms == null){
	System.out.println(this.toString+" : atms is null" );
}else{
	System.out.println(this.toString+" : atms is "+atms );
}
String btms = req.getParameter("btms");
if( btms == null){
	System.out.println(this.toString+" : btms is null" );
}else{
	System.out.println(this.toString+" : btms is "+btms );
}
String budg_yymm = req.getParameter("budg_yymm");
if( budg_yymm == null){
	System.out.println(this.toString+" : budg_yymm is null" );
}else{
	System.out.println(this.toString+" : budg_yymm is "+budg_yymm );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String start_len1 = req.getParameter("start_len1");
if( start_len1 == null){
	System.out.println(this.toString+" : start_len1 is null" );
}else{
	System.out.println(this.toString+" : start_len1 is "+start_len1 );
}
String end_len1 = req.getParameter("end_len1");
if( end_len1 == null){
	System.out.println(this.toString+" : end_len1 is null" );
}else{
	System.out.println(this.toString+" : end_len1 is "+end_len1 );
}
String cond1 = req.getParameter("cond1");
if( cond1 == null){
	System.out.println(this.toString+" : cond1 is null" );
}else{
	System.out.println(this.toString+" : cond1 is "+cond1 );
}
String start_len2 = req.getParameter("start_len2");
if( start_len2 == null){
	System.out.println(this.toString+" : start_len2 is null" );
}else{
	System.out.println(this.toString+" : start_len2 is "+start_len2 );
}
String end_len2 = req.getParameter("end_len2");
if( end_len2 == null){
	System.out.println(this.toString+" : end_len2 is null" );
}else{
	System.out.println(this.toString+" : end_len2 is "+end_len2 );
}
String cond2 = req.getParameter("cond2");
if( cond2 == null){
	System.out.println(this.toString+" : cond2 is null" );
}else{
	System.out.println(this.toString+" : cond2 is "+cond2 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String brlen = Util.checkString(req.getParameter("brlen"));
String brzero = Util.checkString(req.getParameter("brzero"));
String bulen = Util.checkString(req.getParameter("bulen"));
String buzero = Util.checkString(req.getParameter("buzero"));
String atms = Util.checkString(req.getParameter("atms"));
String btms = Util.checkString(req.getParameter("btms"));
String budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String start_len1 = Util.checkString(req.getParameter("start_len1"));
String end_len1 = Util.checkString(req.getParameter("end_len1"));
String cond1 = Util.checkString(req.getParameter("cond1"));
String start_len2 = Util.checkString(req.getParameter("start_len2"));
String end_len2 = Util.checkString(req.getParameter("end_len2"));
String cond2 = Util.checkString(req.getParameter("cond2"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String brlen = Util.Uni2Ksc(Util.checkString(req.getParameter("brlen")));
String brzero = Util.Uni2Ksc(Util.checkString(req.getParameter("brzero")));
String bulen = Util.Uni2Ksc(Util.checkString(req.getParameter("bulen")));
String buzero = Util.Uni2Ksc(Util.checkString(req.getParameter("buzero")));
String atms = Util.Uni2Ksc(Util.checkString(req.getParameter("atms")));
String btms = Util.Uni2Ksc(Util.checkString(req.getParameter("btms")));
String budg_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String start_len1 = Util.Uni2Ksc(Util.checkString(req.getParameter("start_len1")));
String end_len1 = Util.Uni2Ksc(Util.checkString(req.getParameter("end_len1")));
String cond1 = Util.Uni2Ksc(Util.checkString(req.getParameter("cond1")));
String start_len2 = Util.Uni2Ksc(Util.checkString(req.getParameter("start_len2")));
String end_len2 = Util.Uni2Ksc(Util.checkString(req.getParameter("end_len2")));
String cond2 = Util.Uni2Ksc(Util.checkString(req.getParameter("cond2")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBrlen(brlen);
dm.setBrzero(brzero);
dm.setBulen(bulen);
dm.setBuzero(buzero);
dm.setAtms(atms);
dm.setBtms(btms);
dm.setBudg_yymm(budg_yymm);
dm.setDept_cd(dept_cd);
dm.setStart_len1(start_len1);
dm.setEnd_len1(end_len1);
dm.setCond1(cond1);
dm.setStart_len2(start_len2);
dm.setEnd_len2(end_len2);
dm.setCond2(cond2);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 12 16:18:06 KST 2009 */