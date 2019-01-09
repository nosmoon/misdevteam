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


package chosun.ciis.se.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.sal.ds.*;
import chosun.ciis.se.sal.rec.*;

/**
 * 
 */


public class SE_SAL_2820_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String bo_cd;
	public String bo_seq;
	public String widr_bgn_mm;
	public String widr_yymm;
	public String widr_mm_amt;
	public String incmg_pers_ip;
	public String incmg_pers;

	public SE_SAL_2820_ADM(){}
	public SE_SAL_2820_ADM(String cmpy_cd, String mode, String bo_cd, String bo_seq, String widr_bgn_mm, String widr_yymm, String widr_mm_amt, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.bo_cd = bo_cd;
		this.bo_seq = bo_seq;
		this.widr_bgn_mm = widr_bgn_mm;
		this.widr_yymm = widr_yymm;
		this.widr_mm_amt = widr_mm_amt;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setWidr_bgn_mm(String widr_bgn_mm){
		this.widr_bgn_mm = widr_bgn_mm;
	}

	public void setWidr_yymm(String widr_yymm){
		this.widr_yymm = widr_yymm;
	}

	public void setWidr_mm_amt(String widr_mm_amt){
		this.widr_mm_amt = widr_mm_amt;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getWidr_bgn_mm(){
		return this.widr_bgn_mm;
	}

	public String getWidr_yymm(){
		return this.widr_yymm;
	}

	public String getWidr_mm_amt(){
		return this.widr_mm_amt;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_SAL_2820_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SAL_2820_ADM dm = (SE_SAL_2820_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.bo_cd);
		cstmt.setString(6, dm.bo_seq);
		cstmt.setString(7, dm.widr_bgn_mm);
		cstmt.setString(8, dm.widr_yymm);
		cstmt.setString(9, dm.widr_mm_amt);
		cstmt.setString(10, dm.incmg_pers_ip);
		cstmt.setString(11, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.sal.ds.SE_SAL_2820_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("bo_cd = [" + getBo_cd() + "]");
		System.out.println("bo_seq = [" + getBo_seq() + "]");
		System.out.println("widr_bgn_mm = [" + getWidr_bgn_mm() + "]");
		System.out.println("widr_yymm = [" + getWidr_yymm() + "]");
		System.out.println("widr_mm_amt = [" + getWidr_mm_amt() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String bo_cd = req.getParameter("bo_cd");
if( bo_cd == null){
	System.out.println(this.toString+" : bo_cd is null" );
}else{
	System.out.println(this.toString+" : bo_cd is "+bo_cd );
}
String bo_seq = req.getParameter("bo_seq");
if( bo_seq == null){
	System.out.println(this.toString+" : bo_seq is null" );
}else{
	System.out.println(this.toString+" : bo_seq is "+bo_seq );
}
String widr_bgn_mm = req.getParameter("widr_bgn_mm");
if( widr_bgn_mm == null){
	System.out.println(this.toString+" : widr_bgn_mm is null" );
}else{
	System.out.println(this.toString+" : widr_bgn_mm is "+widr_bgn_mm );
}
String widr_yymm = req.getParameter("widr_yymm");
if( widr_yymm == null){
	System.out.println(this.toString+" : widr_yymm is null" );
}else{
	System.out.println(this.toString+" : widr_yymm is "+widr_yymm );
}
String widr_mm_amt = req.getParameter("widr_mm_amt");
if( widr_mm_amt == null){
	System.out.println(this.toString+" : widr_mm_amt is null" );
}else{
	System.out.println(this.toString+" : widr_mm_amt is "+widr_mm_amt );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String bo_seq = Util.checkString(req.getParameter("bo_seq"));
String widr_bgn_mm = Util.checkString(req.getParameter("widr_bgn_mm"));
String widr_yymm = Util.checkString(req.getParameter("widr_yymm"));
String widr_mm_amt = Util.checkString(req.getParameter("widr_mm_amt"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String bo_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_seq")));
String widr_bgn_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("widr_bgn_mm")));
String widr_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("widr_yymm")));
String widr_mm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("widr_mm_amt")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setBo_cd(bo_cd);
dm.setBo_seq(bo_seq);
dm.setWidr_bgn_mm(widr_bgn_mm);
dm.setWidr_yymm(widr_yymm);
dm.setWidr_mm_amt(widr_mm_amt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 02 11:47:06 KST 2014 */