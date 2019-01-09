/***************************************************************************************************
* 파일명 : SS_D_INFOEXGDM.java
* 기능 : 정보공유 게시판 삭제
* 작성일자 : 2004-05-20
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
 * 정보공유 게시판 삭제
 *
 */

public class SS_D_INFOEXGDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String clsf;
	public long seq;
	public String incmgpers;

	public SS_D_INFOEXGDM(){}
	public SS_D_INFOEXGDM(String clsf, long seq, String incmgpers){
		this.clsf = clsf;
		this.seq = seq;
		this.incmgpers = incmgpers;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public void setSeq(long seq){
		this.seq = seq;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public String getClsf(){
		return this.clsf;
	}

	public long getSeq(){
		return this.seq;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call SP_SS_D_INFOEXG( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_D_INFOEXGDM dm = (SS_D_INFOEXGDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.clsf);
		cstmt.setLong(4, dm.seq);
		cstmt.setString(5, dm.incmgpers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.share.ds.SS_D_INFOEXGDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String clsf = req.getParameter("clsf");
if( clsf == null){
	System.out.println(this.toString+" : clsf is null" );
}else{
	System.out.println(this.toString+" : clsf is "+clsf );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String clsf = Util.checkString(req.getParameter("clsf"));
String seq = Util.checkString(req.getParameter("seq"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setClsf(clsf);
dm.setSeq(seq);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 21 18:07:48 KST 2004 */