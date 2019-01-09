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


package chosun.ciis.pr.prtexec.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.prtexec.ds.*;
import chosun.ciis.pr.prtexec.rec.*;

/**
 * 
 */


public class PR_PRTEXEC_2013_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_yy;
	public String occr_seq;
	public String fix_clsf;
	public String chg_pers;

	public PR_PRTEXEC_2013_UDM(){}
	public PR_PRTEXEC_2013_UDM(String cmpy_cd, String occr_yy, String occr_seq, String fix_clsf, String chg_pers){
		this.cmpy_cd = cmpy_cd;
		this.occr_yy = occr_yy;
		this.occr_seq = occr_seq;
		this.fix_clsf = fix_clsf;
		this.chg_pers = chg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_yy(String occr_yy){
		this.occr_yy = occr_yy;
	}

	public void setOccr_seq(String occr_seq){
		this.occr_seq = occr_seq;
	}

	public void setFix_clsf(String fix_clsf){
		this.fix_clsf = fix_clsf;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_yy(){
		return this.occr_yy;
	}

	public String getOccr_seq(){
		return this.occr_seq;
	}

	public String getFix_clsf(){
		return this.fix_clsf;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call SP_PR_PRTEXEC_2013_U( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PRTEXEC_2013_UDM dm = (PR_PRTEXEC_2013_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_yy);
		cstmt.setString(5, dm.occr_seq);
		cstmt.setString(6, dm.fix_clsf);
		cstmt.setString(7, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.prtexec.ds.PR_PRTEXEC_2013_UDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("occr_yy = " + getOccr_yy());
        System.out.println("occr_seq = " + getOccr_seq());
        System.out.println("fix_clsf = " + getFix_clsf());
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
String occr_yy = req.getParameter("occr_yy");
if( occr_yy == null){
	System.out.println(this.toString+" : occr_yy is null" );
}else{
	System.out.println(this.toString+" : occr_yy is "+occr_yy );
}
String occr_seq = req.getParameter("occr_seq");
if( occr_seq == null){
	System.out.println(this.toString+" : occr_seq is null" );
}else{
	System.out.println(this.toString+" : occr_seq is "+occr_seq );
}
String fix_clsf = req.getParameter("fix_clsf");
if( fix_clsf == null){
	System.out.println(this.toString+" : fix_clsf is null" );
}else{
	System.out.println(this.toString+" : fix_clsf is "+fix_clsf );
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
String occr_yy = Util.checkString(req.getParameter("occr_yy"));
String occr_seq = Util.checkString(req.getParameter("occr_seq"));
String fix_clsf = Util.checkString(req.getParameter("fix_clsf"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_yy")));
String occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_seq")));
String fix_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fix_clsf")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_yy(occr_yy);
dm.setOccr_seq(occr_seq);
dm.setFix_clsf(fix_clsf);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 28 21:20:50 KST 2009 */