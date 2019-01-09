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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2193_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String uid;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_sub_seq;
	public String slip_occr_dt2;
	public String budg_cd;
	public String budg_cd1;
	public String budg_cd2;
	public String budg_cd3;
	public String budg_cd4;
	public String budg_cd5;

	public FC_ACCT_2193_SDM(){}
	public FC_ACCT_2193_SDM(String cmpy_cd, String uid, String slip_occr_dt, String slip_clsf_cd, String slip_seq, String slip_sub_seq, String slip_occr_dt2, String budg_cd, String budg_cd1, String budg_cd2, String budg_cd3, String budg_cd4, String budg_cd5){
		this.cmpy_cd = cmpy_cd;
		this.uid = uid;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_seq = slip_seq;
		this.slip_sub_seq = slip_sub_seq;
		this.slip_occr_dt2 = slip_occr_dt2;
		this.budg_cd = budg_cd;
		this.budg_cd1 = budg_cd1;
		this.budg_cd2 = budg_cd2;
		this.budg_cd3 = budg_cd3;
		this.budg_cd4 = budg_cd4;
		this.budg_cd5 = budg_cd5;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setSlip_sub_seq(String slip_sub_seq){
		this.slip_sub_seq = slip_sub_seq;
	}

	public void setSlip_occr_dt2(String slip_occr_dt2){
		this.slip_occr_dt2 = slip_occr_dt2;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_cd1(String budg_cd1){
		this.budg_cd1 = budg_cd1;
	}

	public void setBudg_cd2(String budg_cd2){
		this.budg_cd2 = budg_cd2;
	}

	public void setBudg_cd3(String budg_cd3){
		this.budg_cd3 = budg_cd3;
	}

	public void setBudg_cd4(String budg_cd4){
		this.budg_cd4 = budg_cd4;
	}

	public void setBudg_cd5(String budg_cd5){
		this.budg_cd5 = budg_cd5;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getUid(){
		return this.uid;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getSlip_sub_seq(){
		return this.slip_sub_seq;
	}

	public String getSlip_occr_dt2(){
		return this.slip_occr_dt2;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_cd1(){
		return this.budg_cd1;
	}

	public String getBudg_cd2(){
		return this.budg_cd2;
	}

	public String getBudg_cd3(){
		return this.budg_cd3;
	}

	public String getBudg_cd4(){
		return this.budg_cd4;
	}

	public String getBudg_cd5(){
		return this.budg_cd5;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2193_S(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2193_SDM dm = (FC_ACCT_2193_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.uid);
		cstmt.setString(5, dm.slip_occr_dt);
		cstmt.setString(6, dm.slip_clsf_cd);
		cstmt.setString(7, dm.slip_seq);
		cstmt.setString(8, dm.slip_sub_seq);
		cstmt.setString(9, dm.slip_occr_dt2);
		cstmt.setString(10, dm.budg_cd);
		cstmt.setString(11, dm.budg_cd1);
		cstmt.setString(12, dm.budg_cd2);
		cstmt.setString(13, dm.budg_cd3);
		cstmt.setString(14, dm.budg_cd4);
		cstmt.setString(15, dm.budg_cd5);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2193_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("uid = [" + getUid() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_seq = [" + getSlip_seq() + "]");
		System.out.println("slip_sub_seq = [" + getSlip_sub_seq() + "]");
		System.out.println("slip_occr_dt2 = [" + getSlip_occr_dt2() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("budg_cd1 = [" + getBudg_cd1() + "]");
		System.out.println("budg_cd2 = [" + getBudg_cd2() + "]");
		System.out.println("budg_cd3 = [" + getBudg_cd3() + "]");
		System.out.println("budg_cd4 = [" + getBudg_cd4() + "]");
		System.out.println("budg_cd5 = [" + getBudg_cd5() + "]");
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
String uid = req.getParameter("uid");
if( uid == null){
	System.out.println(this.toString+" : uid is null" );
}else{
	System.out.println(this.toString+" : uid is "+uid );
}
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String slip_seq = req.getParameter("slip_seq");
if( slip_seq == null){
	System.out.println(this.toString+" : slip_seq is null" );
}else{
	System.out.println(this.toString+" : slip_seq is "+slip_seq );
}
String slip_sub_seq = req.getParameter("slip_sub_seq");
if( slip_sub_seq == null){
	System.out.println(this.toString+" : slip_sub_seq is null" );
}else{
	System.out.println(this.toString+" : slip_sub_seq is "+slip_sub_seq );
}
String slip_occr_dt2 = req.getParameter("slip_occr_dt2");
if( slip_occr_dt2 == null){
	System.out.println(this.toString+" : slip_occr_dt2 is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt2 is "+slip_occr_dt2 );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String budg_cd1 = req.getParameter("budg_cd1");
if( budg_cd1 == null){
	System.out.println(this.toString+" : budg_cd1 is null" );
}else{
	System.out.println(this.toString+" : budg_cd1 is "+budg_cd1 );
}
String budg_cd2 = req.getParameter("budg_cd2");
if( budg_cd2 == null){
	System.out.println(this.toString+" : budg_cd2 is null" );
}else{
	System.out.println(this.toString+" : budg_cd2 is "+budg_cd2 );
}
String budg_cd3 = req.getParameter("budg_cd3");
if( budg_cd3 == null){
	System.out.println(this.toString+" : budg_cd3 is null" );
}else{
	System.out.println(this.toString+" : budg_cd3 is "+budg_cd3 );
}
String budg_cd4 = req.getParameter("budg_cd4");
if( budg_cd4 == null){
	System.out.println(this.toString+" : budg_cd4 is null" );
}else{
	System.out.println(this.toString+" : budg_cd4 is "+budg_cd4 );
}
String budg_cd5 = req.getParameter("budg_cd5");
if( budg_cd5 == null){
	System.out.println(this.toString+" : budg_cd5 is null" );
}else{
	System.out.println(this.toString+" : budg_cd5 is "+budg_cd5 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String uid = Util.checkString(req.getParameter("uid"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
String slip_occr_dt2 = Util.checkString(req.getParameter("slip_occr_dt2"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String budg_cd1 = Util.checkString(req.getParameter("budg_cd1"));
String budg_cd2 = Util.checkString(req.getParameter("budg_cd2"));
String budg_cd3 = Util.checkString(req.getParameter("budg_cd3"));
String budg_cd4 = Util.checkString(req.getParameter("budg_cd4"));
String budg_cd5 = Util.checkString(req.getParameter("budg_cd5"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String slip_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_sub_seq")));
String slip_occr_dt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt2")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String budg_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd1")));
String budg_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd2")));
String budg_cd3 = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd3")));
String budg_cd4 = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd4")));
String budg_cd5 = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd5")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setUid(uid);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_seq(slip_seq);
dm.setSlip_sub_seq(slip_sub_seq);
dm.setSlip_occr_dt2(slip_occr_dt2);
dm.setBudg_cd(budg_cd);
dm.setBudg_cd1(budg_cd1);
dm.setBudg_cd2(budg_cd2);
dm.setBudg_cd3(budg_cd3);
dm.setBudg_cd4(budg_cd4);
dm.setBudg_cd5(budg_cd5);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 07 11:56:38 KST 2009 */