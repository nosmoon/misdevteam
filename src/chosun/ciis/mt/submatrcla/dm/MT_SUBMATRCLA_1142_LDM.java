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


package chosun.ciis.mt.submatrcla.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrcla.ds.*;
import chosun.ciis.mt.submatrcla.rec.*;

/**
 * 
 */


public class MT_SUBMATRCLA_1142_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String matr_cd;
	public String matr_nm;
	public String occr_dt_fr;
	public String occr_dt_to;
	public String buy_proc_stat;
	public String acpn_dt_fr;
	public String acpn_dt_to;
	public String dept_cd;
	public String res_yn;
	public String acpn_yn;
	public String reqgubun;
	public String name;
	public String group;

	public MT_SUBMATRCLA_1142_LDM(){}
	public MT_SUBMATRCLA_1142_LDM(String cmpy_cd, String matr_cd, String matr_nm, String occr_dt_fr, String occr_dt_to, String buy_proc_stat, String acpn_dt_fr, String acpn_dt_to, String dept_cd, String res_yn, String acpn_yn, String reqgubun, String name, String group){
		this.cmpy_cd = cmpy_cd;
		this.matr_cd = matr_cd;
		this.matr_nm = matr_nm;
		this.occr_dt_fr = occr_dt_fr;
		this.occr_dt_to = occr_dt_to;
		this.buy_proc_stat = buy_proc_stat;
		this.acpn_dt_fr = acpn_dt_fr;
		this.acpn_dt_to = acpn_dt_to;
		this.dept_cd = dept_cd;
		this.res_yn = res_yn;
		this.acpn_yn = acpn_yn;
		this.reqgubun = reqgubun;
		this.name = name;
		this.group = group;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setOccr_dt_fr(String occr_dt_fr){
		this.occr_dt_fr = occr_dt_fr;
	}

	public void setOccr_dt_to(String occr_dt_to){
		this.occr_dt_to = occr_dt_to;
	}

	public void setBuy_proc_stat(String buy_proc_stat){
		this.buy_proc_stat = buy_proc_stat;
	}

	public void setAcpn_dt_fr(String acpn_dt_fr){
		this.acpn_dt_fr = acpn_dt_fr;
	}

	public void setAcpn_dt_to(String acpn_dt_to){
		this.acpn_dt_to = acpn_dt_to;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setRes_yn(String res_yn){
		this.res_yn = res_yn;
	}

	public void setAcpn_yn(String acpn_yn){
		this.acpn_yn = acpn_yn;
	}

	public void setReqgubun(String reqgubun){
		this.reqgubun = reqgubun;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setGroup(String group){
		this.group = group;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getOccr_dt_fr(){
		return this.occr_dt_fr;
	}

	public String getOccr_dt_to(){
		return this.occr_dt_to;
	}

	public String getBuy_proc_stat(){
		return this.buy_proc_stat;
	}

	public String getAcpn_dt_fr(){
		return this.acpn_dt_fr;
	}

	public String getAcpn_dt_to(){
		return this.acpn_dt_to;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getRes_yn(){
		return this.res_yn;
	}

	public String getAcpn_yn(){
		return this.acpn_yn;
	}

	public String getReqgubun(){
		return this.reqgubun;
	}

	public String getName(){
		return this.name;
	}

	public String getGroup(){
		return this.group;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATRCLA_1142_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATRCLA_1142_LDM dm = (MT_SUBMATRCLA_1142_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.matr_cd);
		cstmt.setString(5, dm.matr_nm);
		cstmt.setString(6, dm.occr_dt_fr);
		cstmt.setString(7, dm.occr_dt_to);
		cstmt.setString(8, dm.buy_proc_stat);
		cstmt.setString(9, dm.acpn_dt_fr);
		cstmt.setString(10, dm.acpn_dt_to);
		cstmt.setString(11, dm.dept_cd);
		cstmt.setString(12, dm.res_yn);
		cstmt.setString(13, dm.acpn_yn);
		cstmt.setString(14, dm.reqgubun);
		cstmt.setString(15, dm.name);
		cstmt.setString(16, dm.group);
		cstmt.registerOutParameter(17, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrcla.ds.MT_SUBMATRCLA_1142_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		System.out.println("matr_nm = [" + getMatr_nm() + "]");
		System.out.println("occr_dt_fr = [" + getOccr_dt_fr() + "]");
		System.out.println("occr_dt_to = [" + getOccr_dt_to() + "]");
		System.out.println("buy_proc_stat = [" + getBuy_proc_stat() + "]");
		System.out.println("acpn_dt_fr = [" + getAcpn_dt_fr() + "]");
		System.out.println("acpn_dt_to = [" + getAcpn_dt_to() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("res_yn = [" + getRes_yn() + "]");
		System.out.println("acpn_yn = [" + getAcpn_yn() + "]");
		System.out.println("reqgubun = [" + getReqgubun() + "]");
		System.out.println("name = [" + getName() + "]");
		System.out.println("group = [" + getGroup() + "]");
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
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String matr_nm = req.getParameter("matr_nm");
if( matr_nm == null){
	System.out.println(this.toString+" : matr_nm is null" );
}else{
	System.out.println(this.toString+" : matr_nm is "+matr_nm );
}
String occr_dt_fr = req.getParameter("occr_dt_fr");
if( occr_dt_fr == null){
	System.out.println(this.toString+" : occr_dt_fr is null" );
}else{
	System.out.println(this.toString+" : occr_dt_fr is "+occr_dt_fr );
}
String occr_dt_to = req.getParameter("occr_dt_to");
if( occr_dt_to == null){
	System.out.println(this.toString+" : occr_dt_to is null" );
}else{
	System.out.println(this.toString+" : occr_dt_to is "+occr_dt_to );
}
String buy_proc_stat = req.getParameter("buy_proc_stat");
if( buy_proc_stat == null){
	System.out.println(this.toString+" : buy_proc_stat is null" );
}else{
	System.out.println(this.toString+" : buy_proc_stat is "+buy_proc_stat );
}
String acpn_dt_fr = req.getParameter("acpn_dt_fr");
if( acpn_dt_fr == null){
	System.out.println(this.toString+" : acpn_dt_fr is null" );
}else{
	System.out.println(this.toString+" : acpn_dt_fr is "+acpn_dt_fr );
}
String acpn_dt_to = req.getParameter("acpn_dt_to");
if( acpn_dt_to == null){
	System.out.println(this.toString+" : acpn_dt_to is null" );
}else{
	System.out.println(this.toString+" : acpn_dt_to is "+acpn_dt_to );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String res_yn = req.getParameter("res_yn");
if( res_yn == null){
	System.out.println(this.toString+" : res_yn is null" );
}else{
	System.out.println(this.toString+" : res_yn is "+res_yn );
}
String acpn_yn = req.getParameter("acpn_yn");
if( acpn_yn == null){
	System.out.println(this.toString+" : acpn_yn is null" );
}else{
	System.out.println(this.toString+" : acpn_yn is "+acpn_yn );
}
String reqgubun = req.getParameter("reqgubun");
if( reqgubun == null){
	System.out.println(this.toString+" : reqgubun is null" );
}else{
	System.out.println(this.toString+" : reqgubun is "+reqgubun );
}
String name = req.getParameter("name");
if( name == null){
	System.out.println(this.toString+" : name is null" );
}else{
	System.out.println(this.toString+" : name is "+name );
}
String group = req.getParameter("group");
if( group == null){
	System.out.println(this.toString+" : group is null" );
}else{
	System.out.println(this.toString+" : group is "+group );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String matr_nm = Util.checkString(req.getParameter("matr_nm"));
String occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
String occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
String buy_proc_stat = Util.checkString(req.getParameter("buy_proc_stat"));
String acpn_dt_fr = Util.checkString(req.getParameter("acpn_dt_fr"));
String acpn_dt_to = Util.checkString(req.getParameter("acpn_dt_to"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String res_yn = Util.checkString(req.getParameter("res_yn"));
String acpn_yn = Util.checkString(req.getParameter("acpn_yn"));
String reqgubun = Util.checkString(req.getParameter("reqgubun"));
String name = Util.checkString(req.getParameter("name"));
String group = Util.checkString(req.getParameter("group"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String matr_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_nm")));
String occr_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_fr")));
String occr_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_to")));
String buy_proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("buy_proc_stat")));
String acpn_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_dt_fr")));
String acpn_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_dt_to")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String res_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("res_yn")));
String acpn_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_yn")));
String reqgubun = Util.Uni2Ksc(Util.checkString(req.getParameter("reqgubun")));
String name = Util.Uni2Ksc(Util.checkString(req.getParameter("name")));
String group = Util.Uni2Ksc(Util.checkString(req.getParameter("group")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMatr_cd(matr_cd);
dm.setMatr_nm(matr_nm);
dm.setOccr_dt_fr(occr_dt_fr);
dm.setOccr_dt_to(occr_dt_to);
dm.setBuy_proc_stat(buy_proc_stat);
dm.setAcpn_dt_fr(acpn_dt_fr);
dm.setAcpn_dt_to(acpn_dt_to);
dm.setDept_cd(dept_cd);
dm.setRes_yn(res_yn);
dm.setAcpn_yn(acpn_yn);
dm.setReqgubun(reqgubun);
dm.setName(name);
dm.setGroup(group);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Oct 15 19:00:21 KST 2009 */