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


package chosun.ciis.hd.info.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.ds.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_2001_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String intern_desty;
	public String psgp_cd;
	public String flnm;

	public HD_INFO_2001_LDM(){}
	public HD_INFO_2001_LDM(String cmpy_cd, String intern_desty, String psgp_cd, String flnm){
		this.cmpy_cd = cmpy_cd;
		this.intern_desty = intern_desty;
		this.psgp_cd = psgp_cd;
		this.flnm = flnm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIntern_desty(String intern_desty){
		this.intern_desty = intern_desty;
	}

	public void setPsgp_cd(String psgp_cd){
		this.psgp_cd = psgp_cd;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIntern_desty(){
		return this.intern_desty;
	}

	public String getPsgp_cd(){
		return this.psgp_cd;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_2001_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_2001_LDM dm = (HD_INFO_2001_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.intern_desty);
		cstmt.setString(5, dm.psgp_cd);
		cstmt.setString(6, dm.flnm);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_2001_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("intern_desty = [" + getIntern_desty() + "]");
		System.out.println("psgp_cd = [" + getPsgp_cd() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
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
String intern_desty = req.getParameter("intern_desty");
if( intern_desty == null){
	System.out.println(this.toString+" : intern_desty is null" );
}else{
	System.out.println(this.toString+" : intern_desty is "+intern_desty );
}
String psgp_cd = req.getParameter("psgp_cd");
if( psgp_cd == null){
	System.out.println(this.toString+" : psgp_cd is null" );
}else{
	System.out.println(this.toString+" : psgp_cd is "+psgp_cd );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String intern_desty = Util.checkString(req.getParameter("intern_desty"));
String psgp_cd = Util.checkString(req.getParameter("psgp_cd"));
String flnm = Util.checkString(req.getParameter("flnm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String intern_desty = Util.Uni2Ksc(Util.checkString(req.getParameter("intern_desty")));
String psgp_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("psgp_cd")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIntern_desty(intern_desty);
dm.setPsgp_cd(psgp_cd);
dm.setFlnm(flnm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 01 18:34:47 KST 2009 */