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


package chosun.ciis.mt.outsdelmt.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.outsdelmt.ds.*;
import chosun.ciis.mt.outsdelmt.rec.*;

/**
 * 
 */


public class MT_OUTSDELMT_1001_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String outsd_elmt_clsf;
	public String aply_yymm;
	public String aply_dt;

	public MT_OUTSDELMT_1001_LDM(){}
	public MT_OUTSDELMT_1001_LDM(String cmpy_cd, String outsd_elmt_clsf, String aply_yymm, String aply_dt){
		this.cmpy_cd = cmpy_cd;
		this.outsd_elmt_clsf = outsd_elmt_clsf;
		this.aply_yymm = aply_yymm;
		this.aply_dt = aply_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOutsd_elmt_clsf(String outsd_elmt_clsf){
		this.outsd_elmt_clsf = outsd_elmt_clsf;
	}

	public void setAply_yymm(String aply_yymm){
		this.aply_yymm = aply_yymm;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOutsd_elmt_clsf(){
		return this.outsd_elmt_clsf;
	}

	public String getAply_yymm(){
		return this.aply_yymm;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getSQL(){
		 return "{ call SP_MT_OUTSDELMT_1001_L( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_OUTSDELMT_1001_LDM dm = (MT_OUTSDELMT_1001_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.outsd_elmt_clsf);
		cstmt.setString(5, dm.aply_yymm);
		cstmt.setString(6, dm.aply_dt);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.outsdelmt.ds.MT_OUTSDELMT_1001_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("outsd_elmt_clsf = " + getOutsd_elmt_clsf());
        System.out.println("aply_yymm = " + getAply_yymm());
        System.out.println("aply_dt = " + getAply_dt());
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
String outsd_elmt_clsf = req.getParameter("outsd_elmt_clsf");
if( outsd_elmt_clsf == null){
	System.out.println(this.toString+" : outsd_elmt_clsf is null" );
}else{
	System.out.println(this.toString+" : outsd_elmt_clsf is "+outsd_elmt_clsf );
}
String aply_yymm = req.getParameter("aply_yymm");
if( aply_yymm == null){
	System.out.println(this.toString+" : aply_yymm is null" );
}else{
	System.out.println(this.toString+" : aply_yymm is "+aply_yymm );
}
String aply_dt = req.getParameter("aply_dt");
if( aply_dt == null){
	System.out.println(this.toString+" : aply_dt is null" );
}else{
	System.out.println(this.toString+" : aply_dt is "+aply_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String outsd_elmt_clsf = Util.checkString(req.getParameter("outsd_elmt_clsf"));
String aply_yymm = Util.checkString(req.getParameter("aply_yymm"));
String aply_dt = Util.checkString(req.getParameter("aply_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String outsd_elmt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("outsd_elmt_clsf")));
String aply_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_yymm")));
String aply_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOutsd_elmt_clsf(outsd_elmt_clsf);
dm.setAply_yymm(aply_yymm);
dm.setAply_dt(aply_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 27 21:42:39 KST 2009 */