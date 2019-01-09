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


package chosun.ciis.ad.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.bas.ds.*;
import chosun.ciis.ad.bas.rec.*;

/**
 * 
 */


public class AD_BAS_2730_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_clsf;
	public String part_cd;
	public String part_nm;
	public String team_cd;
	public String del_yn;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String flag;

	public AD_BAS_2730_ADM(){}
	public AD_BAS_2730_ADM(String cmpy_cd, String medi_clsf, String part_cd, String part_nm, String team_cd, String del_yn, String incmg_pers_ip, String incmg_pers, String flag){
		this.cmpy_cd = cmpy_cd;
		this.medi_clsf = medi_clsf;
		this.part_cd = part_cd;
		this.part_nm = part_nm;
		this.team_cd = team_cd;
		this.del_yn = del_yn;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setTeam_cd(String team_cd){
		this.team_cd = team_cd;
	}

	public void setDel_yn(String del_yn){
		this.del_yn = del_yn;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getTeam_cd(){
		return this.team_cd;
	}

	public String getDel_yn(){
		return this.del_yn;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BAS_2730_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_2730_ADM dm = (AD_BAS_2730_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_clsf);
		cstmt.setString(5, dm.part_cd);
		cstmt.setString(6, dm.part_nm);
		cstmt.setString(7, dm.team_cd);
		cstmt.setString(8, dm.del_yn);
		cstmt.setString(9, dm.incmg_pers_ip);
		cstmt.setString(10, dm.incmg_pers);
		cstmt.setString(11, dm.flag);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_2730_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_clsf = [" + getMedi_clsf() + "]");
		System.out.println("part_cd = [" + getPart_cd() + "]");
		System.out.println("part_nm = [" + getPart_nm() + "]");
		System.out.println("team_cd = [" + getTeam_cd() + "]");
		System.out.println("del_yn = [" + getDel_yn() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("flag = [" + getFlag() + "]");
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
String medi_clsf = req.getParameter("medi_clsf");
if( medi_clsf == null){
	System.out.println(this.toString+" : medi_clsf is null" );
}else{
	System.out.println(this.toString+" : medi_clsf is "+medi_clsf );
}
String part_cd = req.getParameter("part_cd");
if( part_cd == null){
	System.out.println(this.toString+" : part_cd is null" );
}else{
	System.out.println(this.toString+" : part_cd is "+part_cd );
}
String part_nm = req.getParameter("part_nm");
if( part_nm == null){
	System.out.println(this.toString+" : part_nm is null" );
}else{
	System.out.println(this.toString+" : part_nm is "+part_nm );
}
String team_cd = req.getParameter("team_cd");
if( team_cd == null){
	System.out.println(this.toString+" : team_cd is null" );
}else{
	System.out.println(this.toString+" : team_cd is "+team_cd );
}
String del_yn = req.getParameter("del_yn");
if( del_yn == null){
	System.out.println(this.toString+" : del_yn is null" );
}else{
	System.out.println(this.toString+" : del_yn is "+del_yn );
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
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
String part_cd = Util.checkString(req.getParameter("part_cd"));
String part_nm = Util.checkString(req.getParameter("part_nm"));
String team_cd = Util.checkString(req.getParameter("team_cd"));
String del_yn = Util.checkString(req.getParameter("del_yn"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String flag = Util.checkString(req.getParameter("flag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
String part_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("part_cd")));
String part_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("part_nm")));
String team_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("team_cd")));
String del_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("del_yn")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_clsf(medi_clsf);
dm.setPart_cd(part_cd);
dm.setPart_nm(part_nm);
dm.setTeam_cd(team_cd);
dm.setDel_yn(del_yn);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setFlag(flag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Aug 29 15:31:55 KST 2009 */