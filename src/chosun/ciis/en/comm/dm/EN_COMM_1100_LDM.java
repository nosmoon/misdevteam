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


package chosun.ciis.en.comm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.comm.ds.*;
import chosun.ciis.en.comm.rec.*;

/**
 * 
 */


public class EN_COMM_1100_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String evnt_yy;
	public String evnt_cd;
	public String evnt_cd_fr;
	public String evnt_cd_to;
	public String evnt_nm1;
	public String evnt_nm2;
	public String srch_clsf;

	public EN_COMM_1100_LDM(){}
	public EN_COMM_1100_LDM(String cmpy_cd, String evnt_yy, String evnt_cd, String evnt_cd_fr, String evnt_cd_to, String evnt_nm1, String evnt_nm2, String srch_clsf){
		this.cmpy_cd = cmpy_cd;
		this.evnt_yy = evnt_yy;
		this.evnt_cd = evnt_cd;
		this.evnt_cd_fr = evnt_cd_fr;
		this.evnt_cd_to = evnt_cd_to;
		this.evnt_nm1 = evnt_nm1;
		this.evnt_nm2 = evnt_nm2;
		this.srch_clsf = srch_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEvnt_yy(String evnt_yy){
		this.evnt_yy = evnt_yy;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_cd_fr(String evnt_cd_fr){
		this.evnt_cd_fr = evnt_cd_fr;
	}

	public void setEvnt_cd_to(String evnt_cd_to){
		this.evnt_cd_to = evnt_cd_to;
	}

	public void setEvnt_nm1(String evnt_nm1){
		this.evnt_nm1 = evnt_nm1;
	}

	public void setEvnt_nm2(String evnt_nm2){
		this.evnt_nm2 = evnt_nm2;
	}

	public void setSrch_clsf(String srch_clsf){
		this.srch_clsf = srch_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEvnt_yy(){
		return this.evnt_yy;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_cd_fr(){
		return this.evnt_cd_fr;
	}

	public String getEvnt_cd_to(){
		return this.evnt_cd_to;
	}

	public String getEvnt_nm1(){
		return this.evnt_nm1;
	}

	public String getEvnt_nm2(){
		return this.evnt_nm2;
	}

	public String getSrch_clsf(){
		return this.srch_clsf;
	}

	public String getSQL(){
		 return "{ call MISENP.SP_EN_COMM_1100_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		EN_COMM_1100_LDM dm = (EN_COMM_1100_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.evnt_yy);
		cstmt.setString(5, dm.evnt_cd);
		cstmt.setString(6, dm.evnt_cd_fr);
		cstmt.setString(7, dm.evnt_cd_to);
		cstmt.setString(8, dm.evnt_nm1);
		cstmt.setString(9, dm.evnt_nm2);
		cstmt.setString(10, dm.srch_clsf);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.en.comm.ds.EN_COMM_1100_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("evnt_yy = " + getEvnt_yy());
        System.out.println("evnt_cd = " + getEvnt_cd());
        System.out.println("evnt_cd_fr = " + getEvnt_cd_fr());
        System.out.println("evnt_cd_to = " + getEvnt_cd_to());
        System.out.println("evnt_nm1 = " + getEvnt_nm1());
        System.out.println("evnt_nm2 = " + getEvnt_nm2());
        System.out.println("srch_clsf = " + getSrch_clsf());
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
String evnt_yy = req.getParameter("evnt_yy");
if( evnt_yy == null){
	System.out.println(this.toString+" : evnt_yy is null" );
}else{
	System.out.println(this.toString+" : evnt_yy is "+evnt_yy );
}
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
}
String evnt_cd_fr = req.getParameter("evnt_cd_fr");
if( evnt_cd_fr == null){
	System.out.println(this.toString+" : evnt_cd_fr is null" );
}else{
	System.out.println(this.toString+" : evnt_cd_fr is "+evnt_cd_fr );
}
String evnt_cd_to = req.getParameter("evnt_cd_to");
if( evnt_cd_to == null){
	System.out.println(this.toString+" : evnt_cd_to is null" );
}else{
	System.out.println(this.toString+" : evnt_cd_to is "+evnt_cd_to );
}
String evnt_nm1 = req.getParameter("evnt_nm1");
if( evnt_nm1 == null){
	System.out.println(this.toString+" : evnt_nm1 is null" );
}else{
	System.out.println(this.toString+" : evnt_nm1 is "+evnt_nm1 );
}
String evnt_nm2 = req.getParameter("evnt_nm2");
if( evnt_nm2 == null){
	System.out.println(this.toString+" : evnt_nm2 is null" );
}else{
	System.out.println(this.toString+" : evnt_nm2 is "+evnt_nm2 );
}
String srch_clsf = req.getParameter("srch_clsf");
if( srch_clsf == null){
	System.out.println(this.toString+" : srch_clsf is null" );
}else{
	System.out.println(this.toString+" : srch_clsf is "+srch_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String evnt_cd_fr = Util.checkString(req.getParameter("evnt_cd_fr"));
String evnt_cd_to = Util.checkString(req.getParameter("evnt_cd_to"));
String evnt_nm1 = Util.checkString(req.getParameter("evnt_nm1"));
String evnt_nm2 = Util.checkString(req.getParameter("evnt_nm2"));
String srch_clsf = Util.checkString(req.getParameter("srch_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evnt_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_yy")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String evnt_cd_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd_fr")));
String evnt_cd_to = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd_to")));
String evnt_nm1 = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_nm1")));
String evnt_nm2 = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_nm2")));
String srch_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEvnt_yy(evnt_yy);
dm.setEvnt_cd(evnt_cd);
dm.setEvnt_cd_fr(evnt_cd_fr);
dm.setEvnt_cd_to(evnt_cd_to);
dm.setEvnt_nm1(evnt_nm1);
dm.setEvnt_nm2(evnt_nm2);
dm.setSrch_clsf(srch_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 06 11:43:12 KST 2009 */