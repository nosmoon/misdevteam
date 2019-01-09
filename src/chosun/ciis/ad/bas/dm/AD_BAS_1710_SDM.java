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


public class AD_BAS_1710_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_clsf;
	public String dlco_clsf;
	public String dlco_no;
	public String basi_dt;
	public String srch_clsf;

	public AD_BAS_1710_SDM(){}
	public AD_BAS_1710_SDM(String cmpy_cd, String medi_clsf, String dlco_clsf, String dlco_no, String basi_dt, String srch_clsf){
		this.cmpy_cd = cmpy_cd;
		this.medi_clsf = medi_clsf;
		this.dlco_clsf = dlco_clsf;
		this.dlco_no = dlco_no;
		this.basi_dt = basi_dt;
		this.srch_clsf = srch_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setSrch_clsf(String srch_clsf){
		this.srch_clsf = srch_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getSrch_clsf(){
		return this.srch_clsf;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BAS_1710_S(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_1710_SDM dm = (AD_BAS_1710_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_clsf);
		cstmt.setString(5, dm.dlco_clsf);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.setString(6, dm.dlco_no);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.setString(7, dm.basi_dt);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.setString(8, dm.srch_clsf);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
		cstmt.registerOutParameter(19, Types.VARCHAR);
		cstmt.registerOutParameter(20, Types.VARCHAR);
		cstmt.registerOutParameter(21, Types.VARCHAR);
		cstmt.registerOutParameter(22, Types.VARCHAR);
		cstmt.registerOutParameter(23, Types.VARCHAR);
		cstmt.registerOutParameter(24, Types.VARCHAR);
		cstmt.registerOutParameter(25, Types.VARCHAR);
		cstmt.registerOutParameter(26, Types.VARCHAR);
		cstmt.registerOutParameter(27, Types.VARCHAR);
		cstmt.registerOutParameter(28, Types.VARCHAR);
		cstmt.registerOutParameter(29, Types.VARCHAR);
		cstmt.registerOutParameter(30, Types.VARCHAR);
		cstmt.registerOutParameter(31, Types.VARCHAR);
		cstmt.registerOutParameter(32, Types.VARCHAR);
		cstmt.registerOutParameter(33, Types.VARCHAR);
		cstmt.registerOutParameter(34, Types.VARCHAR);
		cstmt.registerOutParameter(35, Types.VARCHAR);
		cstmt.registerOutParameter(36, Types.VARCHAR);
		cstmt.registerOutParameter(37, Types.VARCHAR);
		cstmt.registerOutParameter(38, Types.VARCHAR);
		cstmt.registerOutParameter(39, OracleTypes.CURSOR);
		cstmt.registerOutParameter(40, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_1710_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_clsf = [" + getMedi_clsf() + "]");
		System.out.println("dlco_clsf = [" + getDlco_clsf() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("basi_dt = [" + getBasi_dt() + "]");
		System.out.println("srch_clsf = [" + getSrch_clsf() + "]");
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
String dlco_clsf = req.getParameter("dlco_clsf");
if( dlco_clsf == null){
	System.out.println(this.toString+" : dlco_clsf is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf is "+dlco_clsf );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String basi_dt = req.getParameter("basi_dt");
if( basi_dt == null){
	System.out.println(this.toString+" : basi_dt is null" );
}else{
	System.out.println(this.toString+" : basi_dt is "+basi_dt );
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
String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String basi_dt = Util.checkString(req.getParameter("basi_dt"));
String srch_clsf = Util.checkString(req.getParameter("srch_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
String dlco_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt")));
String srch_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_clsf(medi_clsf);
dm.setDlco_clsf(dlco_clsf);
dm.setDlco_no(dlco_no);
dm.setBasi_dt(basi_dt);
dm.setSrch_clsf(srch_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 27 20:10:30 KST 2009 */