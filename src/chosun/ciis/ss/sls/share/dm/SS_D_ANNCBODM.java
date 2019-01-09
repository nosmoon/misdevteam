/***************************************************************************************************
* 파일명 : .java
* 기능 : 정보공유-실시간공지-지국공지 삭제
* 작성일자 : 2009-04-16
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.share.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.ds.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * 정보공유-실시간공지-지국공지 삭제
 */

public class SS_D_ANNCBODM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String seq;

	public SS_D_ANNCBODM(){}
	public SS_D_ANNCBODM(String seq){
		this.seq = seq;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSQL(){
		 return "{ call SP_SS_D_ANNCBO( ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_D_ANNCBODM dm = (SS_D_ANNCBODM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.seq);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.share.ds.SS_D_ANNCBODataSet();
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String seq = Util.checkString(req.getParameter("seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setSeq(seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 16 14:55:56 KST 2009 */