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


public class AD_BAS_2650_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String trgt_clsf;
	public String trgt_obj;
	public String trgt_yymm;
	public String trgt_amt;
	public String team_cd;
	public String part_cd;
	public String chrg_emp_no;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String flag;

	public AD_BAS_2650_ADM(){}
	public AD_BAS_2650_ADM(String cmpy_cd, String trgt_clsf, String trgt_obj, String trgt_yymm, String trgt_amt, String team_cd, String part_cd, String chrg_emp_no, String incmg_pers_ip, String incmg_pers, String flag){
		this.cmpy_cd = cmpy_cd;
		this.trgt_clsf = trgt_clsf;
		this.trgt_obj = trgt_obj;
		this.trgt_yymm = trgt_yymm;
		this.trgt_amt = trgt_amt;
		this.team_cd = team_cd;
		this.part_cd = part_cd;
		this.chrg_emp_no = chrg_emp_no;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setTrgt_clsf(String trgt_clsf){
		this.trgt_clsf = trgt_clsf;
	}

	public void setTrgt_obj(String trgt_obj){
		this.trgt_obj = trgt_obj;
	}

	public void setTrgt_yymm(String trgt_yymm){
		this.trgt_yymm = trgt_yymm;
	}

	public void setTrgt_amt(String trgt_amt){
		this.trgt_amt = trgt_amt;
	}

	public void setTeam_cd(String team_cd){
		this.team_cd = team_cd;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setChrg_emp_no(String chrg_emp_no){
		this.chrg_emp_no = chrg_emp_no;
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

	public String getTrgt_clsf(){
		return this.trgt_clsf;
	}

	public String getTrgt_obj(){
		return this.trgt_obj;
	}

	public String getTrgt_yymm(){
		return this.trgt_yymm;
	}

	public String getTrgt_amt(){
		return this.trgt_amt;
	}

	public String getTeam_cd(){
		return this.team_cd;
	}

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getChrg_emp_no(){
		return this.chrg_emp_no;
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
		 return "{ call MISADV.SP_AD_BAS_2650_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_2650_ADM dm = (AD_BAS_2650_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.trgt_clsf);
		cstmt.setString(5, dm.trgt_obj);
		cstmt.setString(6, dm.trgt_yymm);
		cstmt.setString(7, dm.trgt_amt);
		cstmt.setString(8, dm.team_cd);
		cstmt.setString(9, dm.part_cd);
		cstmt.setString(10, dm.chrg_emp_no);
		cstmt.setString(11, dm.incmg_pers_ip);
		cstmt.setString(12, dm.incmg_pers);
		cstmt.setString(13, dm.flag);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_2650_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("trgt_clsf = [" + getTrgt_clsf() + "]");
		System.out.println("trgt_obj = [" + getTrgt_obj() + "]");
		System.out.println("trgt_yymm = [" + getTrgt_yymm() + "]");
		System.out.println("trgt_amt = [" + getTrgt_amt() + "]");
		System.out.println("team_cd = [" + getTeam_cd() + "]");
		System.out.println("part_cd = [" + getPart_cd() + "]");
		System.out.println("chrg_emp_no = [" + getChrg_emp_no() + "]");
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
String trgt_clsf = req.getParameter("trgt_clsf");
if( trgt_clsf == null){
	System.out.println(this.toString+" : trgt_clsf is null" );
}else{
	System.out.println(this.toString+" : trgt_clsf is "+trgt_clsf );
}
String trgt_obj = req.getParameter("trgt_obj");
if( trgt_obj == null){
	System.out.println(this.toString+" : trgt_obj is null" );
}else{
	System.out.println(this.toString+" : trgt_obj is "+trgt_obj );
}
String trgt_yymm = req.getParameter("trgt_yymm");
if( trgt_yymm == null){
	System.out.println(this.toString+" : trgt_yymm is null" );
}else{
	System.out.println(this.toString+" : trgt_yymm is "+trgt_yymm );
}
String trgt_amt = req.getParameter("trgt_amt");
if( trgt_amt == null){
	System.out.println(this.toString+" : trgt_amt is null" );
}else{
	System.out.println(this.toString+" : trgt_amt is "+trgt_amt );
}
String team_cd = req.getParameter("team_cd");
if( team_cd == null){
	System.out.println(this.toString+" : team_cd is null" );
}else{
	System.out.println(this.toString+" : team_cd is "+team_cd );
}
String part_cd = req.getParameter("part_cd");
if( part_cd == null){
	System.out.println(this.toString+" : part_cd is null" );
}else{
	System.out.println(this.toString+" : part_cd is "+part_cd );
}
String chrg_emp_no = req.getParameter("chrg_emp_no");
if( chrg_emp_no == null){
	System.out.println(this.toString+" : chrg_emp_no is null" );
}else{
	System.out.println(this.toString+" : chrg_emp_no is "+chrg_emp_no );
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
String trgt_clsf = Util.checkString(req.getParameter("trgt_clsf"));
String trgt_obj = Util.checkString(req.getParameter("trgt_obj"));
String trgt_yymm = Util.checkString(req.getParameter("trgt_yymm"));
String trgt_amt = Util.checkString(req.getParameter("trgt_amt"));
String team_cd = Util.checkString(req.getParameter("team_cd"));
String part_cd = Util.checkString(req.getParameter("part_cd"));
String chrg_emp_no = Util.checkString(req.getParameter("chrg_emp_no"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String flag = Util.checkString(req.getParameter("flag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String trgt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt_clsf")));
String trgt_obj = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt_obj")));
String trgt_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt_yymm")));
String trgt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt_amt")));
String team_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("team_cd")));
String part_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("part_cd")));
String chrg_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_emp_no")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setTrgt_clsf(trgt_clsf);
dm.setTrgt_obj(trgt_obj);
dm.setTrgt_yymm(trgt_yymm);
dm.setTrgt_amt(trgt_amt);
dm.setTeam_cd(team_cd);
dm.setPart_cd(part_cd);
dm.setChrg_emp_no(chrg_emp_no);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setFlag(flag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 25 11:59:15 KST 2009 */