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


public class IS_DEP_4030_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String aprv_dt;
	public String aprv_no;
	public String card_no;
	public String rcpm_amt;
	public String coms;
	public String rcpm_dt;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String mode;

	public IS_DEP_4030_ADM(){}
	public IS_DEP_4030_ADM(String cmpy_cd, String aprv_dt, String aprv_no, String card_no, String rcpm_amt, String coms, String rcpm_dt, String incmg_pers_ip, String incmg_pers, String mode){
		this.cmpy_cd = cmpy_cd;
		this.aprv_dt = aprv_dt;
		this.aprv_no = aprv_no;
		this.card_no = card_no;
		this.rcpm_amt = rcpm_amt;
		this.coms = coms;
		this.rcpm_dt = rcpm_dt;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAprv_dt(String aprv_dt){
		this.aprv_dt = aprv_dt;
	}

	public void setAprv_no(String aprv_no){
		this.aprv_no = aprv_no;
	}

	public void setCard_no(String card_no){
		this.card_no = card_no;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setComs(String coms){
		this.coms = coms;
	}

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAprv_dt(){
		return this.aprv_dt;
	}

	public String getAprv_no(){
		return this.aprv_no;
	}

	public String getCard_no(){
		return this.card_no;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getComs(){
		return this.coms;
	}

	public String getRcpm_dt(){
		return this.rcpm_dt;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_DEP_4030_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_DEP_4030_ADM dm = (IS_DEP_4030_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.aprv_dt);
		cstmt.setString(5, dm.aprv_no);
		cstmt.setString(6, dm.card_no);
		cstmt.setString(7, dm.rcpm_amt);
		cstmt.setString(8, dm.coms);
		cstmt.setString(9, dm.rcpm_dt);
		cstmt.setString(10, dm.incmg_pers_ip);
		cstmt.setString(11, dm.incmg_pers);
		cstmt.setString(12, dm.mode);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.dep.ds.IS_DEP_4030_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("aprv_dt = [" + getAprv_dt() + "]");
		System.out.println("aprv_no = [" + getAprv_no() + "]");
		System.out.println("card_no = [" + getCard_no() + "]");
		System.out.println("rcpm_amt = [" + getRcpm_amt() + "]");
		System.out.println("coms = [" + getComs() + "]");
		System.out.println("rcpm_dt = [" + getRcpm_dt() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("mode = [" + getMode() + "]");
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
String aprv_dt = req.getParameter("aprv_dt");
if( aprv_dt == null){
	System.out.println(this.toString+" : aprv_dt is null" );
}else{
	System.out.println(this.toString+" : aprv_dt is "+aprv_dt );
}
String aprv_no = req.getParameter("aprv_no");
if( aprv_no == null){
	System.out.println(this.toString+" : aprv_no is null" );
}else{
	System.out.println(this.toString+" : aprv_no is "+aprv_no );
}
String card_no = req.getParameter("card_no");
if( card_no == null){
	System.out.println(this.toString+" : card_no is null" );
}else{
	System.out.println(this.toString+" : card_no is "+card_no );
}
String rcpm_amt = req.getParameter("rcpm_amt");
if( rcpm_amt == null){
	System.out.println(this.toString+" : rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : rcpm_amt is "+rcpm_amt );
}
String coms = req.getParameter("coms");
if( coms == null){
	System.out.println(this.toString+" : coms is null" );
}else{
	System.out.println(this.toString+" : coms is "+coms );
}
String rcpm_dt = req.getParameter("rcpm_dt");
if( rcpm_dt == null){
	System.out.println(this.toString+" : rcpm_dt is null" );
}else{
	System.out.println(this.toString+" : rcpm_dt is "+rcpm_dt );
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String aprv_dt = Util.checkString(req.getParameter("aprv_dt"));
String aprv_no = Util.checkString(req.getParameter("aprv_no"));
String card_no = Util.checkString(req.getParameter("card_no"));
String rcpm_amt = Util.checkString(req.getParameter("rcpm_amt"));
String coms = Util.checkString(req.getParameter("coms"));
String rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String mode = Util.checkString(req.getParameter("mode"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aprv_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aprv_dt")));
String aprv_no = Util.Uni2Ksc(Util.checkString(req.getParameter("aprv_no")));
String card_no = Util.Uni2Ksc(Util.checkString(req.getParameter("card_no")));
String rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_amt")));
String coms = Util.Uni2Ksc(Util.checkString(req.getParameter("coms")));
String rcpm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_dt")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAprv_dt(aprv_dt);
dm.setAprv_no(aprv_no);
dm.setCard_no(card_no);
dm.setRcpm_amt(rcpm_amt);
dm.setComs(coms);
dm.setRcpm_dt(rcpm_dt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setMode(mode);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 10 10:21:00 KST 2012 */