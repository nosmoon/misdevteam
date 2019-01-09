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


package chosun.ciis.mt.commatr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.ds.*;
import chosun.ciis.mt.commatr.rec.*;

/**
 * 
 */


public class MT_COMMATR_3310_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String gubun;
	public String dlco_no;
	public String seq;
	public String chrg_pers_nm;
	public String chrg_pers_tel_no;
	public String chrg_pers_email;
	public String incmg_pers_ipaddr;
	public String incmg_pers;

	public MT_COMMATR_3310_ADM(){}
	public MT_COMMATR_3310_ADM(String cmpy_cd, String gubun, String dlco_no, String seq, String chrg_pers_nm, String chrg_pers_tel_no, String chrg_pers_email, String incmg_pers_ipaddr, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.gubun = gubun;
		this.dlco_no = dlco_no;
		this.seq = seq;
		this.chrg_pers_nm = chrg_pers_nm;
		this.chrg_pers_tel_no = chrg_pers_tel_no;
		this.chrg_pers_email = chrg_pers_email;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setChrg_pers_tel_no(String chrg_pers_tel_no){
		this.chrg_pers_tel_no = chrg_pers_tel_no;
	}

	public void setChrg_pers_email(String chrg_pers_email){
		this.chrg_pers_email = chrg_pers_email;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getChrg_pers_tel_no(){
		return this.chrg_pers_tel_no;
	}

	public String getChrg_pers_email(){
		return this.chrg_pers_email;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_COMMATR_3310_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_COMMATR_3310_ADM dm = (MT_COMMATR_3310_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.gubun);
		cstmt.setString(5, dm.dlco_no);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.chrg_pers_nm);
		cstmt.setString(8, dm.chrg_pers_tel_no);
		cstmt.setString(9, dm.chrg_pers_email);
		cstmt.setString(10, dm.incmg_pers_ipaddr);
		cstmt.setString(11, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.commatr.ds.MT_COMMATR_3310_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("chrg_pers_nm = [" + getChrg_pers_nm() + "]");
		System.out.println("chrg_pers_tel_no = [" + getChrg_pers_tel_no() + "]");
		System.out.println("chrg_pers_email = [" + getChrg_pers_email() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String chrg_pers_nm = req.getParameter("chrg_pers_nm");
if( chrg_pers_nm == null){
	System.out.println(this.toString+" : chrg_pers_nm is null" );
}else{
	System.out.println(this.toString+" : chrg_pers_nm is "+chrg_pers_nm );
}
String chrg_pers_tel_no = req.getParameter("chrg_pers_tel_no");
if( chrg_pers_tel_no == null){
	System.out.println(this.toString+" : chrg_pers_tel_no is null" );
}else{
	System.out.println(this.toString+" : chrg_pers_tel_no is "+chrg_pers_tel_no );
}
String chrg_pers_email = req.getParameter("chrg_pers_email");
if( chrg_pers_email == null){
	System.out.println(this.toString+" : chrg_pers_email is null" );
}else{
	System.out.println(this.toString+" : chrg_pers_email is "+chrg_pers_email );
}
String incmg_pers_ipaddr = req.getParameter("incmg_pers_ipaddr");
if( incmg_pers_ipaddr == null){
	System.out.println(this.toString+" : incmg_pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipaddr is "+incmg_pers_ipaddr );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String gubun = Util.checkString(req.getParameter("gubun"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String seq = Util.checkString(req.getParameter("seq"));
String chrg_pers_nm = Util.checkString(req.getParameter("chrg_pers_nm"));
String chrg_pers_tel_no = Util.checkString(req.getParameter("chrg_pers_tel_no"));
String chrg_pers_email = Util.checkString(req.getParameter("chrg_pers_email"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String chrg_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers_nm")));
String chrg_pers_tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers_tel_no")));
String chrg_pers_email = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers_email")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setGubun(gubun);
dm.setDlco_no(dlco_no);
dm.setSeq(seq);
dm.setChrg_pers_nm(chrg_pers_nm);
dm.setChrg_pers_tel_no(chrg_pers_tel_no);
dm.setChrg_pers_email(chrg_pers_email);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 13 11:20:26 KST 2009 */