/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 2009-01-29
* 작성자 : 김태길
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.co.cocd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.cocd.ds.*;
import chosun.ciis.co.cocd.rec.*;

/**
 * 
 */


public class CO_COCD_1210_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String job_clsf;
	public String cd_clsf;
	public String cd;
	public String cdnm;
	public String mang_cd_1;
	public String mang_cd_2;
	public String mang_cd_3;
	public String mang_cd_4;
	public String mang_cd_5;
	public String mang_cd_6;
	public String mang_cd_7;
	public String mang_cd_8;
	public String mang_cd_9;
	public String mang_cd_10;
	public String mang_cd_11;
	public String mang_cd_12;

	public CO_COCD_1210_LDM(){}
	public CO_COCD_1210_LDM(String cmpy_cd, String job_clsf, String cd_clsf, String cd, String cdnm, String mang_cd_1, String mang_cd_2, String mang_cd_3, String mang_cd_4, String mang_cd_5, String mang_cd_6, String mang_cd_7, String mang_cd_8, String mang_cd_9, String mang_cd_10, String mang_cd_11, String mang_cd_12){
		this.cmpy_cd = cmpy_cd;
		this.job_clsf = job_clsf;
		this.cd_clsf = cd_clsf;
		this.cd = cd;
		this.cdnm = cdnm;
		this.mang_cd_1 = mang_cd_1;
		this.mang_cd_2 = mang_cd_2;
		this.mang_cd_3 = mang_cd_3;
		this.mang_cd_4 = mang_cd_4;
		this.mang_cd_5 = mang_cd_5;
		this.mang_cd_6 = mang_cd_6;
		this.mang_cd_7 = mang_cd_7;
		this.mang_cd_8 = mang_cd_8;
		this.mang_cd_9 = mang_cd_9;
		this.mang_cd_10 = mang_cd_10;
		this.mang_cd_11 = mang_cd_11;
		this.mang_cd_12 = mang_cd_12;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public void setCd_clsf(String cd_clsf){
		this.cd_clsf = cd_clsf;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setMang_cd_1(String mang_cd_1){
		this.mang_cd_1 = mang_cd_1;
	}

	public void setMang_cd_2(String mang_cd_2){
		this.mang_cd_2 = mang_cd_2;
	}

	public void setMang_cd_3(String mang_cd_3){
		this.mang_cd_3 = mang_cd_3;
	}

	public void setMang_cd_4(String mang_cd_4){
		this.mang_cd_4 = mang_cd_4;
	}

	public void setMang_cd_5(String mang_cd_5){
		this.mang_cd_5 = mang_cd_5;
	}

	public void setMang_cd_6(String mang_cd_6){
		this.mang_cd_6 = mang_cd_6;
	}

	public void setMang_cd_7(String mang_cd_7){
		this.mang_cd_7 = mang_cd_7;
	}

	public void setMang_cd_8(String mang_cd_8){
		this.mang_cd_8 = mang_cd_8;
	}

	public void setMang_cd_9(String mang_cd_9){
		this.mang_cd_9 = mang_cd_9;
	}

	public void setMang_cd_10(String mang_cd_10){
		this.mang_cd_10 = mang_cd_10;
	}

	public void setMang_cd_11(String mang_cd_11){
		this.mang_cd_11 = mang_cd_11;
	}

	public void setMang_cd_12(String mang_cd_12){
		this.mang_cd_12 = mang_cd_12;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getCd_clsf(){
		return this.cd_clsf;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getMang_cd_1(){
		return this.mang_cd_1;
	}

	public String getMang_cd_2(){
		return this.mang_cd_2;
	}

	public String getMang_cd_3(){
		return this.mang_cd_3;
	}

	public String getMang_cd_4(){
		return this.mang_cd_4;
	}

	public String getMang_cd_5(){
		return this.mang_cd_5;
	}

	public String getMang_cd_6(){
		return this.mang_cd_6;
	}

	public String getMang_cd_7(){
		return this.mang_cd_7;
	}

	public String getMang_cd_8(){
		return this.mang_cd_8;
	}

	public String getMang_cd_9(){
		return this.mang_cd_9;
	}

	public String getMang_cd_10(){
		return this.mang_cd_10;
	}

	public String getMang_cd_11(){
		return this.mang_cd_11;
	}

	public String getMang_cd_12(){
		return this.mang_cd_12;
	}

	public String getSQL(){
		 return "{ call SP_CO_COCD_1210_L( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_COCD_1210_LDM dm = (CO_COCD_1210_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.job_clsf);
		cstmt.setString(5, dm.cd_clsf);
		cstmt.setString(6, dm.cd);
		cstmt.setString(7, dm.cdnm);
		cstmt.setString(8, dm.mang_cd_1);
		cstmt.setString(9, dm.mang_cd_2);
		cstmt.setString(10, dm.mang_cd_3);
		cstmt.setString(11, dm.mang_cd_4);
		cstmt.setString(12, dm.mang_cd_5);
		cstmt.setString(13, dm.mang_cd_6);
		cstmt.setString(14, dm.mang_cd_7);
		cstmt.setString(15, dm.mang_cd_8);
		cstmt.setString(16, dm.mang_cd_9);
		cstmt.setString(17, dm.mang_cd_10);
		cstmt.setString(18, dm.mang_cd_11);
		cstmt.setString(19, dm.mang_cd_12);
		cstmt.registerOutParameter(20, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.cocd.ds.CO_COCD_1210_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("job_clsf = " + getJob_clsf());
        System.out.println("cd_clsf = " + getCd_clsf());
        System.out.println("cd = " + getCd());
        System.out.println("cdnm = " + getCdnm());
        System.out.println("mang_cd_1 = " + getMang_cd_1());
        System.out.println("mang_cd_2 = " + getMang_cd_2());
        System.out.println("mang_cd_3 = " + getMang_cd_3());
        System.out.println("mang_cd_4 = " + getMang_cd_4());
        System.out.println("mang_cd_5 = " + getMang_cd_5());
        System.out.println("mang_cd_6 = " + getMang_cd_6());
        System.out.println("mang_cd_7 = " + getMang_cd_7());
        System.out.println("mang_cd_8 = " + getMang_cd_8());
        System.out.println("mang_cd_9 = " + getMang_cd_9());
        System.out.println("mang_cd_10 = " + getMang_cd_10());
        System.out.println("mang_cd_11 = " + getMang_cd_11());
        System.out.println("mang_cd_12 = " + getMang_cd_12());
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
String job_clsf = req.getParameter("job_clsf");
if( job_clsf == null){
	System.out.println(this.toString+" : job_clsf is null" );
}else{
	System.out.println(this.toString+" : job_clsf is "+job_clsf );
}
String cd_clsf = req.getParameter("cd_clsf");
if( cd_clsf == null){
	System.out.println(this.toString+" : cd_clsf is null" );
}else{
	System.out.println(this.toString+" : cd_clsf is "+cd_clsf );
}
String cd = req.getParameter("cd");
if( cd == null){
	System.out.println(this.toString+" : cd is null" );
}else{
	System.out.println(this.toString+" : cd is "+cd );
}
String cdnm = req.getParameter("cdnm");
if( cdnm == null){
	System.out.println(this.toString+" : cdnm is null" );
}else{
	System.out.println(this.toString+" : cdnm is "+cdnm );
}
String mang_cd_1 = req.getParameter("mang_cd_1");
if( mang_cd_1 == null){
	System.out.println(this.toString+" : mang_cd_1 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_1 is "+mang_cd_1 );
}
String mang_cd_2 = req.getParameter("mang_cd_2");
if( mang_cd_2 == null){
	System.out.println(this.toString+" : mang_cd_2 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_2 is "+mang_cd_2 );
}
String mang_cd_3 = req.getParameter("mang_cd_3");
if( mang_cd_3 == null){
	System.out.println(this.toString+" : mang_cd_3 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_3 is "+mang_cd_3 );
}
String mang_cd_4 = req.getParameter("mang_cd_4");
if( mang_cd_4 == null){
	System.out.println(this.toString+" : mang_cd_4 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_4 is "+mang_cd_4 );
}
String mang_cd_5 = req.getParameter("mang_cd_5");
if( mang_cd_5 == null){
	System.out.println(this.toString+" : mang_cd_5 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_5 is "+mang_cd_5 );
}
String mang_cd_6 = req.getParameter("mang_cd_6");
if( mang_cd_6 == null){
	System.out.println(this.toString+" : mang_cd_6 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_6 is "+mang_cd_6 );
}
String mang_cd_7 = req.getParameter("mang_cd_7");
if( mang_cd_7 == null){
	System.out.println(this.toString+" : mang_cd_7 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_7 is "+mang_cd_7 );
}
String mang_cd_8 = req.getParameter("mang_cd_8");
if( mang_cd_8 == null){
	System.out.println(this.toString+" : mang_cd_8 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_8 is "+mang_cd_8 );
}
String mang_cd_9 = req.getParameter("mang_cd_9");
if( mang_cd_9 == null){
	System.out.println(this.toString+" : mang_cd_9 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_9 is "+mang_cd_9 );
}
String mang_cd_10 = req.getParameter("mang_cd_10");
if( mang_cd_10 == null){
	System.out.println(this.toString+" : mang_cd_10 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_10 is "+mang_cd_10 );
}
String mang_cd_11 = req.getParameter("mang_cd_11");
if( mang_cd_11 == null){
	System.out.println(this.toString+" : mang_cd_11 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_11 is "+mang_cd_11 );
}
String mang_cd_12 = req.getParameter("mang_cd_12");
if( mang_cd_12 == null){
	System.out.println(this.toString+" : mang_cd_12 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_12 is "+mang_cd_12 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String job_clsf = Util.checkString(req.getParameter("job_clsf"));
String cd_clsf = Util.checkString(req.getParameter("cd_clsf"));
String cd = Util.checkString(req.getParameter("cd"));
String cdnm = Util.checkString(req.getParameter("cdnm"));
String mang_cd_1 = Util.checkString(req.getParameter("mang_cd_1"));
String mang_cd_2 = Util.checkString(req.getParameter("mang_cd_2"));
String mang_cd_3 = Util.checkString(req.getParameter("mang_cd_3"));
String mang_cd_4 = Util.checkString(req.getParameter("mang_cd_4"));
String mang_cd_5 = Util.checkString(req.getParameter("mang_cd_5"));
String mang_cd_6 = Util.checkString(req.getParameter("mang_cd_6"));
String mang_cd_7 = Util.checkString(req.getParameter("mang_cd_7"));
String mang_cd_8 = Util.checkString(req.getParameter("mang_cd_8"));
String mang_cd_9 = Util.checkString(req.getParameter("mang_cd_9"));
String mang_cd_10 = Util.checkString(req.getParameter("mang_cd_10"));
String mang_cd_11 = Util.checkString(req.getParameter("mang_cd_11"));
String mang_cd_12 = Util.checkString(req.getParameter("mang_cd_12"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String job_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("job_clsf")));
String cd_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cd_clsf")));
String cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cd")));
String cdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cdnm")));
String mang_cd_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_1")));
String mang_cd_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_2")));
String mang_cd_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_3")));
String mang_cd_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_4")));
String mang_cd_5 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_5")));
String mang_cd_6 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_6")));
String mang_cd_7 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_7")));
String mang_cd_8 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_8")));
String mang_cd_9 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_9")));
String mang_cd_10 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_10")));
String mang_cd_11 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_11")));
String mang_cd_12 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_12")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setJob_clsf(job_clsf);
dm.setCd_clsf(cd_clsf);
dm.setCd(cd);
dm.setCdnm(cdnm);
dm.setMang_cd_1(mang_cd_1);
dm.setMang_cd_2(mang_cd_2);
dm.setMang_cd_3(mang_cd_3);
dm.setMang_cd_4(mang_cd_4);
dm.setMang_cd_5(mang_cd_5);
dm.setMang_cd_6(mang_cd_6);
dm.setMang_cd_7(mang_cd_7);
dm.setMang_cd_8(mang_cd_8);
dm.setMang_cd_9(mang_cd_9);
dm.setMang_cd_10(mang_cd_10);
dm.setMang_cd_11(mang_cd_11);
dm.setMang_cd_12(mang_cd_12);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 04 15:21:35 KST 2009 */