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


package chosun.ciis.co.semuro.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.semuro.ds.*;

/**
 *
 */


public class CO_SEMURO_1300_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String gubun;
	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String semuro_no;
	public String stat_clsf;
	public String stat_clsf_dt_tm;
	public String rtn_issu_semuro_no;

	public CO_SEMURO_1300_UDM(){}
	public CO_SEMURO_1300_UDM(String gubun, String cmpy_cd, String occr_dt, String seq, String semuro_no, String stat_clsf, String stat_clsf_dt_tm, String rtn_issu_semuro_no){
		this.gubun = gubun;
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.semuro_no = semuro_no;
		this.stat_clsf = stat_clsf;
		this.stat_clsf_dt_tm = stat_clsf_dt_tm;
		this.rtn_issu_semuro_no = rtn_issu_semuro_no;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSemuro_no(String semuro_no){
		this.semuro_no = semuro_no;
	}

	public void setStat_clsf(String stat_clsf){
		this.stat_clsf = stat_clsf;
	}

	public void setStat_clsf_dt_tm(String stat_clsf_dt_tm){
		this.stat_clsf_dt_tm = stat_clsf_dt_tm;
	}

	public void setRtn_issu_semuro_no(String rtn_issu_semuro_no){
		this.rtn_issu_semuro_no = rtn_issu_semuro_no;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSemuro_no(){
		return this.semuro_no;
	}

	public String getStat_clsf(){
		return this.stat_clsf;
	}

	public String getStat_clsf_dt_tm(){
		return this.stat_clsf_dt_tm;
	}

	public String getRtn_issu_semuro_no(){
		return this.rtn_issu_semuro_no;
	}

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_SEMURO_1300_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_SEMURO_1300_UDM dm = (CO_SEMURO_1300_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.gubun);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.semuro_no);
		cstmt.setString(8, dm.stat_clsf);
		cstmt.setString(9, dm.stat_clsf_dt_tm);
		cstmt.setString(10, dm.rtn_issu_semuro_no);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.semuro.ds.CO_SEMURO_1300_UDataSet();
	}



    public void print(){
        System.out.println("gubun = " + getGubun());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("occr_dt = " + getOccr_dt());
        System.out.println("seq = " + getSeq());
        System.out.println("semuro_no = " + getSemuro_no());
        System.out.println("stat_clsf = " + getStat_clsf());
        System.out.println("stat_clsf_dt_tm = " + getStat_clsf_dt_tm());
        System.out.println("rtn_issu_semuro_no = " + getRtn_issu_semuro_no());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String semuro_no = req.getParameter("semuro_no");
if( semuro_no == null){
	System.out.println(this.toString+" : semuro_no is null" );
}else{
	System.out.println(this.toString+" : semuro_no is "+semuro_no );
}
String stat_clsf = req.getParameter("stat_clsf");
if( stat_clsf == null){
	System.out.println(this.toString+" : stat_clsf is null" );
}else{
	System.out.println(this.toString+" : stat_clsf is "+stat_clsf );
}
String stat_clsf_dt_tm = req.getParameter("stat_clsf_dt_tm");
if( stat_clsf_dt_tm == null){
	System.out.println(this.toString+" : stat_clsf_dt_tm is null" );
}else{
	System.out.println(this.toString+" : stat_clsf_dt_tm is "+stat_clsf_dt_tm );
}
String rtn_issu_semuro_no = req.getParameter("rtn_issu_semuro_no");
if( rtn_issu_semuro_no == null){
	System.out.println(this.toString+" : rtn_issu_semuro_no is null" );
}else{
	System.out.println(this.toString+" : rtn_issu_semuro_no is "+rtn_issu_semuro_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String gubun = Util.checkString(req.getParameter("gubun"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String semuro_no = Util.checkString(req.getParameter("semuro_no"));
String stat_clsf = Util.checkString(req.getParameter("stat_clsf"));
String stat_clsf_dt_tm = Util.checkString(req.getParameter("stat_clsf_dt_tm"));
String rtn_issu_semuro_no = Util.checkString(req.getParameter("rtn_issu_semuro_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String semuro_no = Util.Uni2Ksc(Util.checkString(req.getParameter("semuro_no")));
String stat_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("stat_clsf")));
String stat_clsf_dt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("stat_clsf_dt_tm")));
String rtn_issu_semuro_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rtn_issu_semuro_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setGubun(gubun);
dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setSemuro_no(semuro_no);
dm.setStat_clsf(stat_clsf);
dm.setStat_clsf_dt_tm(stat_clsf_dt_tm);
dm.setRtn_issu_semuro_no(rtn_issu_semuro_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 05 11:36:01 KST 2009 */