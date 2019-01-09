/***************************************************************************************************
* 파일명 : SS_S_DAWNRPT_DWLOADDM.java
* 기능 : 정보공유 새벽근무보고 파일다운로드
* 작성일자 : 2004-01-07
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.share.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.ds.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * 정보공유-새벽근무보고 파일다운로드
 *
 */


public class SS_S_DAWNRPT_DWLOADDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String makedt;
	public String makepersid;
	public long dwloadcnt;

	public SS_S_DAWNRPT_DWLOADDM(){}
	public SS_S_DAWNRPT_DWLOADDM(String makedt, String makepersid, long dwloadcnt){
		this.makedt = makedt;
		this.makepersid = makepersid;
		this.dwloadcnt = dwloadcnt;
	}

	public void setMakedt(String makedt){
		this.makedt = makedt;
	}

	public void setMakepersid(String makepersid){
		this.makepersid = makepersid;
	}

	public void setDwloadcnt(long dwloadcnt){
		this.dwloadcnt = dwloadcnt;
	}

	public String getMakedt(){
		return this.makedt;
	}

	public String getMakepersid(){
		return this.makepersid;
	}

	public long getDwloadcnt(){
		return this.dwloadcnt;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_DAWNRPT_DWLOAD( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_DAWNRPT_DWLOADDM dm = (SS_S_DAWNRPT_DWLOADDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.makedt);
		cstmt.setString(4, dm.makepersid);
		cstmt.setLong(5, dm.dwloadcnt);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.BLOB);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.share.ds.SS_S_DAWNRPT_DWLOADDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String makedt = req.getParameter("makedt");
if( makedt == null){
	System.out.println(this.toString+" : makedt is null" );
}else{
	System.out.println(this.toString+" : makedt is "+makedt );
}
String makepersid = req.getParameter("makepersid");
if( makepersid == null){
	System.out.println(this.toString+" : makepersid is null" );
}else{
	System.out.println(this.toString+" : makepersid is "+makepersid );
}
String dwloadcnt = req.getParameter("dwloadcnt");
if( dwloadcnt == null){
	System.out.println(this.toString+" : dwloadcnt is null" );
}else{
	System.out.println(this.toString+" : dwloadcnt is "+dwloadcnt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String makedt = Util.checkString(req.getParameter("makedt"));
String makepersid = Util.checkString(req.getParameter("makepersid"));
String dwloadcnt = Util.checkString(req.getParameter("dwloadcnt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String makedt = Util.Uni2Ksc(Util.checkString(req.getParameter("makedt")));
String makepersid = Util.Uni2Ksc(Util.checkString(req.getParameter("makepersid")));
String dwloadcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("dwloadcnt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMakedt(makedt);
dm.setMakepersid(makepersid);
dm.setDwloadcnt(dwloadcnt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 07 22:15:14 KST 2004 */