/***************************************************************************************************
* 파일명 : SS_S_OTHRPT_DWLOADDM.java
* 기능 : 정보공유 타사동향보고 파일다운로드
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
 * 정보공유-타사동향보고 파일다운로드
 *
 */


public class SS_S_OTHRPT_DWLOADDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public long seq;
	public long dwloadcnt;

	public SS_S_OTHRPT_DWLOADDM(){}
	public SS_S_OTHRPT_DWLOADDM(long seq, long dwloadcnt){
		this.seq = seq;
		this.dwloadcnt = dwloadcnt;
	}

	public void setSeq(long seq){
		this.seq = seq;
	}

	public void setDwloadcnt(long dwloadcnt){
		this.dwloadcnt = dwloadcnt;
	}

	public long getSeq(){
		return this.seq;
	}

	public long getDwloadcnt(){
		return this.dwloadcnt;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_OTHRPT_DWLOAD( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_OTHRPT_DWLOADDM dm = (SS_S_OTHRPT_DWLOADDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setLong(3, dm.seq);
		cstmt.setLong(4, dm.dwloadcnt);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.BLOB);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.share.ds.SS_S_OTHRPT_DWLOADDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
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

String seq = Util.checkString(req.getParameter("seq"));
String dwloadcnt = Util.checkString(req.getParameter("dwloadcnt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String dwloadcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("dwloadcnt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setSeq(seq);
dm.setDwloadcnt(dwloadcnt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 07 22:21:41 KST 2004 */