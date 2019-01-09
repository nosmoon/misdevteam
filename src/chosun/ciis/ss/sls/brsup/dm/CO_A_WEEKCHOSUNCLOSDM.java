/***************************************************************************************************
 * 파일명   : CO_A_WEEKCHOSUNCLOSDM.java
 * 기능     : 주간조선관리-배달비정산마감
 * 작성일자 : 2007-04-16
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     : 
 **************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 주간조선관리-배달비정산마감
 */

public class CO_A_WEEKCHOSUNCLOSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String closyymm;
	public String wrkuser;

	public CO_A_WEEKCHOSUNCLOSDM(){}
	public CO_A_WEEKCHOSUNCLOSDM(String accflag, String closyymm, String wrkuser){
		this.accflag = accflag;
		this.closyymm = closyymm;
		this.wrkuser = wrkuser;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setClosyymm(String closyymm){
		this.closyymm = closyymm;
	}

	public void setWrkuser(String wrkuser){
		this.wrkuser = wrkuser;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getClosyymm(){
		return this.closyymm;
	}

	public String getWrkuser(){
		return this.wrkuser;
	}

	public String getSQL(){
		 return "{ call SP_CO_A_WEEKCHOSUNCLOS( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_A_WEEKCHOSUNCLOSDM dm = (CO_A_WEEKCHOSUNCLOSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.closyymm);
		cstmt.setString(5, dm.wrkuser);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.CO_A_WEEKCHOSUNCLOSDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String closyymm = req.getParameter("closyymm");
if( closyymm == null){
	System.out.println(this.toString+" : closyymm is null" );
}else{
	System.out.println(this.toString+" : closyymm is "+closyymm );
}
String wrkuser = req.getParameter("wrkuser");
if( wrkuser == null){
	System.out.println(this.toString+" : wrkuser is null" );
}else{
	System.out.println(this.toString+" : wrkuser is "+wrkuser );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String accflag = Util.checkString(req.getParameter("accflag"));
String closyymm = Util.checkString(req.getParameter("closyymm"));
String wrkuser = Util.checkString(req.getParameter("wrkuser"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String closyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("closyymm")));
String wrkuser = Util.Uni2Ksc(Util.checkString(req.getParameter("wrkuser")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setClosyymm(closyymm);
dm.setWrkuser(wrkuser);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 17 17:31:31 KST 2007 */