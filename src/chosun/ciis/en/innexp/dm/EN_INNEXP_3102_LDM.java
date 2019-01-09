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


package chosun.ciis.en.innexp.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.innexp.ds.*;
import chosun.ciis.en.innexp.rec.*;

/**
 * 
 */


public class EN_INNEXP_3102_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String evnt_yy1;
	public String evnt_cd1;
	public String evnt_seq1;
	public String evnt_yy2;
	public String evnt_cd2;
	public String evnt_seq2;
	public String evnt_yy3;
	public String evnt_cd3;
	public String evnt_seq3;
	public String srch_clsf;

	public EN_INNEXP_3102_LDM(){}
	public EN_INNEXP_3102_LDM(String cmpy_cd, String evnt_yy1, String evnt_cd1, String evnt_seq1, String evnt_yy2, String evnt_cd2, String evnt_seq2, String evnt_yy3, String evnt_cd3, String evnt_seq3, String srch_clsf){
		this.cmpy_cd = cmpy_cd;
		this.evnt_yy1 = evnt_yy1;
		this.evnt_cd1 = evnt_cd1;
		this.evnt_seq1 = evnt_seq1;
		this.evnt_yy2 = evnt_yy2;
		this.evnt_cd2 = evnt_cd2;
		this.evnt_seq2 = evnt_seq2;
		this.evnt_yy3 = evnt_yy3;
		this.evnt_cd3 = evnt_cd3;
		this.evnt_seq3 = evnt_seq3;
		this.srch_clsf = srch_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEvnt_yy1(String evnt_yy1){
		this.evnt_yy1 = evnt_yy1;
	}

	public void setEvnt_cd1(String evnt_cd1){
		this.evnt_cd1 = evnt_cd1;
	}

	public void setEvnt_seq1(String evnt_seq1){
		this.evnt_seq1 = evnt_seq1;
	}

	public void setEvnt_yy2(String evnt_yy2){
		this.evnt_yy2 = evnt_yy2;
	}

	public void setEvnt_cd2(String evnt_cd2){
		this.evnt_cd2 = evnt_cd2;
	}

	public void setEvnt_seq2(String evnt_seq2){
		this.evnt_seq2 = evnt_seq2;
	}

	public void setEvnt_yy3(String evnt_yy3){
		this.evnt_yy3 = evnt_yy3;
	}

	public void setEvnt_cd3(String evnt_cd3){
		this.evnt_cd3 = evnt_cd3;
	}

	public void setEvnt_seq3(String evnt_seq3){
		this.evnt_seq3 = evnt_seq3;
	}

	public void setSrch_clsf(String srch_clsf){
		this.srch_clsf = srch_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEvnt_yy1(){
		return this.evnt_yy1;
	}

	public String getEvnt_cd1(){
		return this.evnt_cd1;
	}

	public String getEvnt_seq1(){
		return this.evnt_seq1;
	}

	public String getEvnt_yy2(){
		return this.evnt_yy2;
	}

	public String getEvnt_cd2(){
		return this.evnt_cd2;
	}

	public String getEvnt_seq2(){
		return this.evnt_seq2;
	}

	public String getEvnt_yy3(){
		return this.evnt_yy3;
	}

	public String getEvnt_cd3(){
		return this.evnt_cd3;
	}

	public String getEvnt_seq3(){
		return this.evnt_seq3;
	}

	public String getSrch_clsf(){
		return this.srch_clsf;
	}

	public String getSQL(){
		 return "{ call MISENP.SP_EN_INNEXP_3102_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		EN_INNEXP_3102_LDM dm = (EN_INNEXP_3102_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.evnt_yy1);
		cstmt.setString(5, dm.evnt_cd1);
		cstmt.setString(6, dm.evnt_seq1);
		cstmt.setString(7, dm.evnt_yy2);
		cstmt.setString(8, dm.evnt_cd2);
		cstmt.setString(9, dm.evnt_seq2);
		cstmt.setString(10, dm.evnt_yy3);
		cstmt.setString(11, dm.evnt_cd3);
		cstmt.setString(12, dm.evnt_seq3);
		cstmt.setString(13, dm.srch_clsf);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.en.innexp.ds.EN_INNEXP_3102_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("evnt_yy1 = " + getEvnt_yy1());
        System.out.println("evnt_cd1 = " + getEvnt_cd1());
        System.out.println("evnt_seq1 = " + getEvnt_seq1());
        System.out.println("evnt_yy2 = " + getEvnt_yy2());
        System.out.println("evnt_cd2 = " + getEvnt_cd2());
        System.out.println("evnt_seq2 = " + getEvnt_seq2());
        System.out.println("evnt_yy3 = " + getEvnt_yy3());
        System.out.println("evnt_cd3 = " + getEvnt_cd3());
        System.out.println("evnt_seq3 = " + getEvnt_seq3());
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
String evnt_yy1 = req.getParameter("evnt_yy1");
if( evnt_yy1 == null){
	System.out.println(this.toString+" : evnt_yy1 is null" );
}else{
	System.out.println(this.toString+" : evnt_yy1 is "+evnt_yy1 );
}
String evnt_cd1 = req.getParameter("evnt_cd1");
if( evnt_cd1 == null){
	System.out.println(this.toString+" : evnt_cd1 is null" );
}else{
	System.out.println(this.toString+" : evnt_cd1 is "+evnt_cd1 );
}
String evnt_seq1 = req.getParameter("evnt_seq1");
if( evnt_seq1 == null){
	System.out.println(this.toString+" : evnt_seq1 is null" );
}else{
	System.out.println(this.toString+" : evnt_seq1 is "+evnt_seq1 );
}
String evnt_yy2 = req.getParameter("evnt_yy2");
if( evnt_yy2 == null){
	System.out.println(this.toString+" : evnt_yy2 is null" );
}else{
	System.out.println(this.toString+" : evnt_yy2 is "+evnt_yy2 );
}
String evnt_cd2 = req.getParameter("evnt_cd2");
if( evnt_cd2 == null){
	System.out.println(this.toString+" : evnt_cd2 is null" );
}else{
	System.out.println(this.toString+" : evnt_cd2 is "+evnt_cd2 );
}
String evnt_seq2 = req.getParameter("evnt_seq2");
if( evnt_seq2 == null){
	System.out.println(this.toString+" : evnt_seq2 is null" );
}else{
	System.out.println(this.toString+" : evnt_seq2 is "+evnt_seq2 );
}
String evnt_yy3 = req.getParameter("evnt_yy3");
if( evnt_yy3 == null){
	System.out.println(this.toString+" : evnt_yy3 is null" );
}else{
	System.out.println(this.toString+" : evnt_yy3 is "+evnt_yy3 );
}
String evnt_cd3 = req.getParameter("evnt_cd3");
if( evnt_cd3 == null){
	System.out.println(this.toString+" : evnt_cd3 is null" );
}else{
	System.out.println(this.toString+" : evnt_cd3 is "+evnt_cd3 );
}
String evnt_seq3 = req.getParameter("evnt_seq3");
if( evnt_seq3 == null){
	System.out.println(this.toString+" : evnt_seq3 is null" );
}else{
	System.out.println(this.toString+" : evnt_seq3 is "+evnt_seq3 );
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
String evnt_yy1 = Util.checkString(req.getParameter("evnt_yy1"));
String evnt_cd1 = Util.checkString(req.getParameter("evnt_cd1"));
String evnt_seq1 = Util.checkString(req.getParameter("evnt_seq1"));
String evnt_yy2 = Util.checkString(req.getParameter("evnt_yy2"));
String evnt_cd2 = Util.checkString(req.getParameter("evnt_cd2"));
String evnt_seq2 = Util.checkString(req.getParameter("evnt_seq2"));
String evnt_yy3 = Util.checkString(req.getParameter("evnt_yy3"));
String evnt_cd3 = Util.checkString(req.getParameter("evnt_cd3"));
String evnt_seq3 = Util.checkString(req.getParameter("evnt_seq3"));
String srch_clsf = Util.checkString(req.getParameter("srch_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evnt_yy1 = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_yy1")));
String evnt_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd1")));
String evnt_seq1 = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_seq1")));
String evnt_yy2 = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_yy2")));
String evnt_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd2")));
String evnt_seq2 = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_seq2")));
String evnt_yy3 = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_yy3")));
String evnt_cd3 = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd3")));
String evnt_seq3 = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_seq3")));
String srch_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEvnt_yy1(evnt_yy1);
dm.setEvnt_cd1(evnt_cd1);
dm.setEvnt_seq1(evnt_seq1);
dm.setEvnt_yy2(evnt_yy2);
dm.setEvnt_cd2(evnt_cd2);
dm.setEvnt_seq2(evnt_seq2);
dm.setEvnt_yy3(evnt_yy3);
dm.setEvnt_cd3(evnt_cd3);
dm.setEvnt_seq3(evnt_seq3);
dm.setSrch_clsf(srch_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 30 09:58:31 KST 2009 */