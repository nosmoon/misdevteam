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


package chosun.ciis.ad.nmd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.nmd.ds.*;
import chosun.ciis.ad.nmd.rec.*;

/**
 * 
 */


public class AD_NMD_5200_MDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dealmedicd;

	public AD_NMD_5200_MDM(){}
	public AD_NMD_5200_MDM(String cmpy_cd, String dealmedicd){
		this.cmpy_cd = cmpy_cd;
		this.dealmedicd = dealmedicd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDealmedicd(String dealmedicd){
		this.dealmedicd = dealmedicd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDealmedicd(){
		return this.dealmedicd;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_NMD_5200_M(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_NMD_5200_MDM dm = (AD_NMD_5200_MDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dealmedicd);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.nmd.ds.AD_NMD_5200_MDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dealmedicd = [" + getDealmedicd() + "]");
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
String dealmedicd = req.getParameter("dealmedicd");
if( dealmedicd == null){
	System.out.println(this.toString+" : dealmedicd is null" );
}else{
	System.out.println(this.toString+" : dealmedicd is "+dealmedicd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dealmedicd = Util.checkString(req.getParameter("dealmedicd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dealmedicd = Util.Uni2Ksc(Util.checkString(req.getParameter("dealmedicd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDealmedicd(dealmedicd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 22 16:19:44 KST 2014 */