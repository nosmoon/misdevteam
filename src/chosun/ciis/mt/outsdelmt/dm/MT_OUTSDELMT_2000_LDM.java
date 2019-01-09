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


public class MT_OUTSDELMT_2000_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yyyymm;
	public String outsd_elmt_clsf;
	public String outsd_elmt_cd;

	public MT_OUTSDELMT_2000_LDM(){}
	public MT_OUTSDELMT_2000_LDM(String cmpy_cd, String yyyymm, String outsd_elmt_clsf, String outsd_elmt_cd){
		this.cmpy_cd = cmpy_cd;
		this.yyyymm = yyyymm;
		this.outsd_elmt_clsf = outsd_elmt_clsf;
		this.outsd_elmt_cd = outsd_elmt_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYyyymm(String yyyymm){
		this.yyyymm = yyyymm;
	}

	public void setOutsd_elmt_clsf(String outsd_elmt_clsf){
		this.outsd_elmt_clsf = outsd_elmt_clsf;
	}

	public void setOutsd_elmt_cd(String outsd_elmt_cd){
		this.outsd_elmt_cd = outsd_elmt_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYyyymm(){
		return this.yyyymm;
	}

	public String getOutsd_elmt_clsf(){
		return this.outsd_elmt_clsf;
	}

	public String getOutsd_elmt_cd(){
		return this.outsd_elmt_cd;
	}

	public String getSQL(){
		 return "{ call SP_MT_OUTSDELMT_2000_L( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_OUTSDELMT_2000_LDM dm = (MT_OUTSDELMT_2000_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yyyymm);
		cstmt.setString(5, dm.outsd_elmt_clsf);
		cstmt.setString(6, dm.outsd_elmt_cd);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.outsdelmt.ds.MT_OUTSDELMT_2000_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("yyyymm = " + getYyyymm());
        System.out.println("outsd_elmt_clsf = " + getOutsd_elmt_clsf());
        System.out.println("outsd_elmt_cd = " + getOutsd_elmt_cd());
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
String yyyymm = req.getParameter("yyyymm");
if( yyyymm == null){
	System.out.println(this.toString+" : yyyymm is null" );
}else{
	System.out.println(this.toString+" : yyyymm is "+yyyymm );
}
String outsd_elmt_clsf = req.getParameter("outsd_elmt_clsf");
if( outsd_elmt_clsf == null){
	System.out.println(this.toString+" : outsd_elmt_clsf is null" );
}else{
	System.out.println(this.toString+" : outsd_elmt_clsf is "+outsd_elmt_clsf );
}
String outsd_elmt_cd = req.getParameter("outsd_elmt_cd");
if( outsd_elmt_cd == null){
	System.out.println(this.toString+" : outsd_elmt_cd is null" );
}else{
	System.out.println(this.toString+" : outsd_elmt_cd is "+outsd_elmt_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yyyymm = Util.checkString(req.getParameter("yyyymm"));
String outsd_elmt_clsf = Util.checkString(req.getParameter("outsd_elmt_clsf"));
String outsd_elmt_cd = Util.checkString(req.getParameter("outsd_elmt_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yyyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyymm")));
String outsd_elmt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("outsd_elmt_clsf")));
String outsd_elmt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("outsd_elmt_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYyyymm(yyyymm);
dm.setOutsd_elmt_clsf(outsd_elmt_clsf);
dm.setOutsd_elmt_cd(outsd_elmt_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 01 15:44:29 KST 2009 */