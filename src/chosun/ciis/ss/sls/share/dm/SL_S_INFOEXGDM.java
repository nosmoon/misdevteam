/***************************************************************************************************
* 파일명 : SL_S_INFOEXGDM.java_모바일용 / agency/commun_111120 참조
* 기능 : 공지사항 상세를 위한 DM
* 작성일자 : 2017-01-24
* 작성자 : 장선희
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
 * 정보공유-실시간 판매국공지-등록,수정,삭제를 위한 DM
 */

public class SL_S_INFOEXGDM extends somo.framework.db.BaseDM implements
		java.io.Serializable {

	public long seq;
	public long brwscnt;
	public String clsf;

	public SL_S_INFOEXGDM() {
	}

	public SL_S_INFOEXGDM(long seq, long brwscnt, String clsf) {
		this.seq = seq;
		this.brwscnt = brwscnt;
		this.clsf = clsf;
	}

	public void setSeq(long seq) {
		this.seq = seq;
	}

	public void setBrwscnt(long brwscnt) {
		this.brwscnt = brwscnt;
	}

	public void setClsf(String clsf) {
		this.clsf = clsf;
	}

	public long getSeq() {
		return this.seq;
	}

	public long getBrwscnt() {
		return this.brwscnt;
	}

	public String getClsf() {
		return this.clsf;
	}

	public String getSQL() {
		return "{ call SP_SL_S_INFOEXG( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm)
			throws SQLException {
		SL_S_INFOEXGDM dm = (SL_S_INFOEXGDM) bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setLong(3, dm.seq);
		cstmt.setLong(4, dm.brwscnt);
		cstmt.setString(5, dm.clsf);
		cstmt.registerOutParameter(6, Types.INTEGER);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.INTEGER);
		cstmt.registerOutParameter(9, Types.INTEGER);
		cstmt.registerOutParameter(10, Types.INTEGER);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
		cstmt.registerOutParameter(19, Types.VARCHAR);
		cstmt.registerOutParameter(20, Types.VARCHAR);
		cstmt.registerOutParameter(21, Types.VARCHAR);
		cstmt.registerOutParameter(22, Types.VARCHAR);
		cstmt.registerOutParameter(23, Types.INTEGER);
		cstmt.registerOutParameter(24, Types.INTEGER);
		cstmt.registerOutParameter(25, Types.INTEGER);
		cstmt.registerOutParameter(26, Types.VARCHAR);
		cstmt.registerOutParameter(27, Types.VARCHAR);
		cstmt.registerOutParameter(28, OracleTypes.CURSOR);
		cstmt.registerOutParameter(29, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject() {
		return new chosun.ciis.ss.sls.share.ds.SL_S_INFOEXGDataSet();
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
 String brwscnt = req.getParameter("brwscnt");
 if( brwscnt == null){
 System.out.println(this.toString+" : brwscnt is null" );
 }else{
 System.out.println(this.toString+" : brwscnt is "+brwscnt );
 }
 String clsf = req.getParameter("clsf");
 if( clsf == null){
 System.out.println(this.toString+" : clsf is null" );
 }else{
 System.out.println(this.toString+" : clsf is "+clsf );
 }
 ----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
 Web Tier에서 req.getParameter() 처리시 사용하십시오.

 String seq = Util.checkString(req.getParameter("seq"));
 String brwscnt = Util.checkString(req.getParameter("brwscnt"));
 String clsf = Util.checkString(req.getParameter("clsf"));
 ----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String brwscnt = Util.Uni2Ksc(Util.checkString(req.getParameter("brwscnt")));
String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
 Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

 dm.setSeq(seq);
 dm.setBrwscnt(brwscnt);
 dm.setClsf(clsf);
 ----------------------------------------------------------------------------------------------------*/

/* 작성시간 : Thu Feb 19 15:59:10 KST 2004 */