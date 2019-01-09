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


package chosun.ciis.en.rcpm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.rcpm.ds.*;
import chosun.ciis.en.rcpm.rec.*;

/**
 * 
 */


public class EN_RCPM_1005_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String rcpm_shet_kind;
	public String rcpm_shet_no;
	public String widr_resn;
	public String rcpm_shet_stat;
	public String issu_pers_emp_no;
	public String chg_pers;

	public EN_RCPM_1005_UDM(){}
	public EN_RCPM_1005_UDM(String cmpy_cd, String rcpm_shet_kind, String rcpm_shet_no, String widr_resn, String rcpm_shet_stat, String issu_pers_emp_no, String chg_pers){
		this.cmpy_cd = cmpy_cd;
		this.rcpm_shet_kind = rcpm_shet_kind;
		this.rcpm_shet_no = rcpm_shet_no;
		this.widr_resn = widr_resn;
		this.rcpm_shet_stat = rcpm_shet_stat;
		this.issu_pers_emp_no = issu_pers_emp_no;
		this.chg_pers = chg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRcpm_shet_kind(String rcpm_shet_kind){
		this.rcpm_shet_kind = rcpm_shet_kind;
	}

	public void setRcpm_shet_no(String rcpm_shet_no){
		this.rcpm_shet_no = rcpm_shet_no;
	}

	public void setWidr_resn(String widr_resn){
		this.widr_resn = widr_resn;
	}

	public void setRcpm_shet_stat(String rcpm_shet_stat){
		this.rcpm_shet_stat = rcpm_shet_stat;
	}

	public void setIssu_pers_emp_no(String issu_pers_emp_no){
		this.issu_pers_emp_no = issu_pers_emp_no;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRcpm_shet_kind(){
		return this.rcpm_shet_kind;
	}

	public String getRcpm_shet_no(){
		return this.rcpm_shet_no;
	}

	public String getWidr_resn(){
		return this.widr_resn;
	}

	public String getRcpm_shet_stat(){
		return this.rcpm_shet_stat;
	}

	public String getIssu_pers_emp_no(){
		return this.issu_pers_emp_no;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call MISENP.SP_EN_RCPM_1005_U(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		EN_RCPM_1005_UDM dm = (EN_RCPM_1005_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.rcpm_shet_kind);
		cstmt.setString(5, dm.rcpm_shet_no);
		cstmt.setString(6, dm.widr_resn);
		cstmt.setString(7, dm.rcpm_shet_stat);
		cstmt.setString(8, dm.issu_pers_emp_no);
		cstmt.setString(9, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.en.rcpm.ds.EN_RCPM_1005_UDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("rcpm_shet_kind = " + getRcpm_shet_kind());
        System.out.println("rcpm_shet_no = " + getRcpm_shet_no());
        System.out.println("widr_resn = " + getWidr_resn());
        System.out.println("rcpm_shet_stat = " + getRcpm_shet_stat());
        System.out.println("issu_pers_emp_no = " + getIssu_pers_emp_no());
        System.out.println("chg_pers = " + getChg_pers());
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
String rcpm_shet_kind = req.getParameter("rcpm_shet_kind");
if( rcpm_shet_kind == null){
	System.out.println(this.toString+" : rcpm_shet_kind is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_kind is "+rcpm_shet_kind );
}
String rcpm_shet_no = req.getParameter("rcpm_shet_no");
if( rcpm_shet_no == null){
	System.out.println(this.toString+" : rcpm_shet_no is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_no is "+rcpm_shet_no );
}
String widr_resn = req.getParameter("widr_resn");
if( widr_resn == null){
	System.out.println(this.toString+" : widr_resn is null" );
}else{
	System.out.println(this.toString+" : widr_resn is "+widr_resn );
}
String rcpm_shet_stat = req.getParameter("rcpm_shet_stat");
if( rcpm_shet_stat == null){
	System.out.println(this.toString+" : rcpm_shet_stat is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_stat is "+rcpm_shet_stat );
}
String issu_pers_emp_no = req.getParameter("issu_pers_emp_no");
if( issu_pers_emp_no == null){
	System.out.println(this.toString+" : issu_pers_emp_no is null" );
}else{
	System.out.println(this.toString+" : issu_pers_emp_no is "+issu_pers_emp_no );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String rcpm_shet_kind = Util.checkString(req.getParameter("rcpm_shet_kind"));
String rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));
String widr_resn = Util.checkString(req.getParameter("widr_resn"));
String rcpm_shet_stat = Util.checkString(req.getParameter("rcpm_shet_stat"));
String issu_pers_emp_no = Util.checkString(req.getParameter("issu_pers_emp_no"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rcpm_shet_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_kind")));
String rcpm_shet_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_no")));
String widr_resn = Util.Uni2Ksc(Util.checkString(req.getParameter("widr_resn")));
String rcpm_shet_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_stat")));
String issu_pers_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_pers_emp_no")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRcpm_shet_kind(rcpm_shet_kind);
dm.setRcpm_shet_no(rcpm_shet_no);
dm.setWidr_resn(widr_resn);
dm.setRcpm_shet_stat(rcpm_shet_stat);
dm.setIssu_pers_emp_no(issu_pers_emp_no);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 11 14:16:30 KST 2009 */