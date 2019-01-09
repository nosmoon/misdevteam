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


package chosun.ciis.mt.close.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.close.ds.*;
import chosun.ciis.mt.close.rec.*;

/**
 * 
 */


public class MT_CLOSE_7002_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String in_yymm;
	public String fac_clsf;
	public String bebubi_cd;

	public MT_CLOSE_7002_LDM(){}
	public MT_CLOSE_7002_LDM(String cmpy_cd, String in_yymm, String fac_clsf, String bebubi_cd){
		this.cmpy_cd = cmpy_cd;
		this.in_yymm = in_yymm;
		this.fac_clsf = fac_clsf;
		this.bebubi_cd = bebubi_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIn_yymm(String in_yymm){
		this.in_yymm = in_yymm;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setBebubi_cd(String bebubi_cd){
		this.bebubi_cd = bebubi_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIn_yymm(){
		return this.in_yymm;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getBebubi_cd(){
		return this.bebubi_cd;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_CLOSE_7002_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_CLOSE_7002_LDM dm = (MT_CLOSE_7002_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.in_yymm);
		cstmt.setString(5, dm.fac_clsf);
		cstmt.setString(6, dm.bebubi_cd);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.close.ds.MT_CLOSE_7002_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("in_yymm = [" + getIn_yymm() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("bebubi_cd = [" + getBebubi_cd() + "]");
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
String in_yymm = req.getParameter("in_yymm");
if( in_yymm == null){
	System.out.println(this.toString+" : in_yymm is null" );
}else{
	System.out.println(this.toString+" : in_yymm is "+in_yymm );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String bebubi_cd = req.getParameter("bebubi_cd");
if( bebubi_cd == null){
	System.out.println(this.toString+" : bebubi_cd is null" );
}else{
	System.out.println(this.toString+" : bebubi_cd is "+bebubi_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String in_yymm = Util.checkString(req.getParameter("in_yymm"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String bebubi_cd = Util.checkString(req.getParameter("bebubi_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String in_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("in_yymm")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String bebubi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bebubi_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIn_yymm(in_yymm);
dm.setFac_clsf(fac_clsf);
dm.setBebubi_cd(bebubi_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 15 10:34:45 KST 2009 */