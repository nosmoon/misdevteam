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


package chosun.ciis.ad.pub.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.ds.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_3620_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String pubc_slip_no;
	public String medi_nm;
	public String cslcrg_pers_nm;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String mode;

	public AD_PUB_3620_ADM(){}
	public AD_PUB_3620_ADM(String cmpy_cd, String pubc_slip_no, String medi_nm, String cslcrg_pers_nm, String incmg_pers_ip, String incmg_pers, String mode){
		this.cmpy_cd = cmpy_cd;
		this.pubc_slip_no = pubc_slip_no;
		this.medi_nm = medi_nm;
		this.cslcrg_pers_nm = cslcrg_pers_nm;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPubc_slip_no(String pubc_slip_no){
		this.pubc_slip_no = pubc_slip_no;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setCslcrg_pers_nm(String cslcrg_pers_nm){
		this.cslcrg_pers_nm = cslcrg_pers_nm;
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

	public String getPubc_slip_no(){
		return this.pubc_slip_no;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getCslcrg_pers_nm(){
		return this.cslcrg_pers_nm;
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
		 return "{ call MISADV.SP_AD_PUB_3620_A(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_3620_ADM dm = (AD_PUB_3620_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.pubc_slip_no);
		cstmt.setString(5, dm.medi_nm);
		cstmt.setString(6, dm.cslcrg_pers_nm);
		cstmt.setString(7, dm.incmg_pers_ip);
		cstmt.setString(8, dm.incmg_pers);
		cstmt.setString(9, dm.mode);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_3620_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		//System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("pubc_slip_no = [" + getPubc_slip_no() + "]");
		//System.out.println("medi_nm = [" + getMedi_nm() + "]");
		System.out.println("cslcrg_pers_nm = [" + getCslcrg_pers_nm() + "]");
		//System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		//System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		//System.out.println("mode = [" + getMode() + "]");
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
String pubc_slip_no = req.getParameter("pubc_slip_no");
if( pubc_slip_no == null){
	System.out.println(this.toString+" : pubc_slip_no is null" );
}else{
	System.out.println(this.toString+" : pubc_slip_no is "+pubc_slip_no );
}
String medi_nm = req.getParameter("medi_nm");
if( medi_nm == null){
	System.out.println(this.toString+" : medi_nm is null" );
}else{
	System.out.println(this.toString+" : medi_nm is "+medi_nm );
}
String cslcrg_pers_nm = req.getParameter("cslcrg_pers_nm");
if( cslcrg_pers_nm == null){
	System.out.println(this.toString+" : cslcrg_pers_nm is null" );
}else{
	System.out.println(this.toString+" : cslcrg_pers_nm is "+cslcrg_pers_nm );
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
String pubc_slip_no = Util.checkString(req.getParameter("pubc_slip_no"));
String medi_nm = Util.checkString(req.getParameter("medi_nm"));
String cslcrg_pers_nm = Util.checkString(req.getParameter("cslcrg_pers_nm"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String mode = Util.checkString(req.getParameter("mode"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String pubc_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_slip_no")));
String medi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_nm")));
String cslcrg_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("cslcrg_pers_nm")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPubc_slip_no(pubc_slip_no);
dm.setMedi_nm(medi_nm);
dm.setCslcrg_pers_nm(cslcrg_pers_nm);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setMode(mode);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 02 14:08:05 KST 2015 */