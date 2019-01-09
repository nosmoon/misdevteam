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


package chosun.ciis.mt.papord.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papord.ds.*;
import chosun.ciis.mt.papord.rec.*;

/**
 * 
 */


public class MT_PAPORD_6002_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String ordr_dt_fr;
	public String ordr_dt_to;

	public MT_PAPORD_6002_LDM(){}
	public MT_PAPORD_6002_LDM(String cmpy_cd, String ordr_dt_fr, String ordr_dt_to){
		this.cmpy_cd = cmpy_cd;
		this.ordr_dt_fr = ordr_dt_fr;
		this.ordr_dt_to = ordr_dt_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOrdr_dt_fr(String ordr_dt_fr){
		this.ordr_dt_fr = ordr_dt_fr;
	}

	public void setOrdr_dt_to(String ordr_dt_to){
		this.ordr_dt_to = ordr_dt_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOrdr_dt_fr(){
		return this.ordr_dt_fr;
	}

	public String getOrdr_dt_to(){
		return this.ordr_dt_to;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPORD_6002_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPORD_6002_LDM dm = (MT_PAPORD_6002_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.ordr_dt_fr);
		cstmt.setString(5, dm.ordr_dt_to);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papord.ds.MT_PAPORD_6002_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("ordr_dt_fr = [" + getOrdr_dt_fr() + "]");
		System.out.println("ordr_dt_to = [" + getOrdr_dt_to() + "]");
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
String ordr_dt_fr = req.getParameter("ordr_dt_fr");
if( ordr_dt_fr == null){
	System.out.println(this.toString+" : ordr_dt_fr is null" );
}else{
	System.out.println(this.toString+" : ordr_dt_fr is "+ordr_dt_fr );
}
String ordr_dt_to = req.getParameter("ordr_dt_to");
if( ordr_dt_to == null){
	System.out.println(this.toString+" : ordr_dt_to is null" );
}else{
	System.out.println(this.toString+" : ordr_dt_to is "+ordr_dt_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String ordr_dt_fr = Util.checkString(req.getParameter("ordr_dt_fr"));
String ordr_dt_to = Util.checkString(req.getParameter("ordr_dt_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String ordr_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("ordr_dt_fr")));
String ordr_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("ordr_dt_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOrdr_dt_fr(ordr_dt_fr);
dm.setOrdr_dt_to(ordr_dt_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 16 22:42:19 KST 2009 */