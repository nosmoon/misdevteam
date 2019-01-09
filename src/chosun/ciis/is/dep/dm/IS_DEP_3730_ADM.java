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


package chosun.ciis.is.dep.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.dep.ds.*;
import chosun.ciis.is.dep.rec.*;

/**
 * 
 */


public class IS_DEP_3730_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String rept_no;
	public String chk_item;
	public String chk_dt;
	public String chk_cont;
	public String incmg_pers_ip;
	public String incmg_pers;

	public IS_DEP_3730_ADM(){}
	public IS_DEP_3730_ADM(String flag, String cmpy_cd, String rept_no, String chk_item, String chk_dt, String chk_cont, String incmg_pers_ip, String incmg_pers){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.rept_no = rept_no;
		this.chk_item = chk_item;
		this.chk_dt = chk_dt;
		this.chk_cont = chk_cont;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRept_no(String rept_no){
		this.rept_no = rept_no;
	}

	public void setChk_item(String chk_item){
		this.chk_item = chk_item;
	}

	public void setChk_dt(String chk_dt){
		this.chk_dt = chk_dt;
	}

	public void setChk_cont(String chk_cont){
		this.chk_cont = chk_cont;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRept_no(){
		return this.rept_no;
	}

	public String getChk_item(){
		return this.chk_item;
	}

	public String getChk_dt(){
		return this.chk_dt;
	}

	public String getChk_cont(){
		return this.chk_cont;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_DEP_3730_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_DEP_3730_ADM dm = (IS_DEP_3730_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.rept_no);
		cstmt.setString(6, dm.chk_item);
		cstmt.setString(7, dm.chk_dt);
		cstmt.setString(8, dm.chk_cont);
		cstmt.setString(9, dm.incmg_pers_ip);
		cstmt.setString(10, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.dep.ds.IS_DEP_3730_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("rept_no = [" + getRept_no() + "]");
		System.out.println("chk_item = [" + getChk_item() + "]");
		System.out.println("chk_dt = [" + getChk_dt() + "]");
		System.out.println("chk_cont = [" + getChk_cont() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String rept_no = req.getParameter("rept_no");
if( rept_no == null){
	System.out.println(this.toString+" : rept_no is null" );
}else{
	System.out.println(this.toString+" : rept_no is "+rept_no );
}
String chk_item = req.getParameter("chk_item");
if( chk_item == null){
	System.out.println(this.toString+" : chk_item is null" );
}else{
	System.out.println(this.toString+" : chk_item is "+chk_item );
}
String chk_dt = req.getParameter("chk_dt");
if( chk_dt == null){
	System.out.println(this.toString+" : chk_dt is null" );
}else{
	System.out.println(this.toString+" : chk_dt is "+chk_dt );
}
String chk_cont = req.getParameter("chk_cont");
if( chk_cont == null){
	System.out.println(this.toString+" : chk_cont is null" );
}else{
	System.out.println(this.toString+" : chk_cont is "+chk_cont );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
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

String flag = Util.checkString(req.getParameter("flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String rept_no = Util.checkString(req.getParameter("rept_no"));
String chk_item = Util.checkString(req.getParameter("chk_item"));
String chk_dt = Util.checkString(req.getParameter("chk_dt"));
String chk_cont = Util.checkString(req.getParameter("chk_cont"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rept_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rept_no")));
String chk_item = Util.Uni2Ksc(Util.checkString(req.getParameter("chk_item")));
String chk_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("chk_dt")));
String chk_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("chk_cont")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setRept_no(rept_no);
dm.setChk_item(chk_item);
dm.setChk_dt(chk_dt);
dm.setChk_cont(chk_cont);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 21 09:16:29 KST 2012 */