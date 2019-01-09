/***************************************************************************************************
* ���ϸ� : SS_L_SHFT_PYMT_II.java
* ��� :   ��������-����-�ڵ���ü-������2-�����ڻ���ȸ
* �ۼ����� : 2004-10-03
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* ��������	: 
* ������	: 
* ��������	:
* ���		: 
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * ��������-����-�ڵ���ü-������2-�����ڻ���ȸ
 *
 */


public class SS_S_SHFT_PYMT_IIDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String pymtseq;
	public String cnfm;

	public SS_S_SHFT_PYMT_IIDM(){}
	public SS_S_SHFT_PYMT_IIDM(String pymtseq, String cnfm){
		this.pymtseq = pymtseq;
		this.cnfm = cnfm;
	}

	public void setPymtseq(String pymtseq){
		this.pymtseq = pymtseq;
	}

	public void setCnfm(String cnfm){
		this.cnfm = cnfm;
	}

	public String getPymtseq(){
		return this.pymtseq;
	}

	public String getCnfm(){
		return this.cnfm;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_SHFT_PYMT_II( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_SHFT_PYMT_IIDM dm = (SS_S_SHFT_PYMT_IIDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.pymtseq);
		cstmt.setString(4, dm.cnfm);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_S_SHFT_PYMT_IIDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String pymtseq = req.getParameter("pymtseq");
if( pymtseq == null){
	System.out.println(this.toString+" : pymtseq is null" );
}else{
	System.out.println(this.toString+" : pymtseq is "+pymtseq );
}
String cnfm = req.getParameter("cnfm");
if( cnfm == null){
	System.out.println(this.toString+" : cnfm is null" );
}else{
	System.out.println(this.toString+" : cnfm is "+cnfm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String pymtseq = Util.checkString(req.getParameter("pymtseq"));
String cnfm = Util.checkString(req.getParameter("cnfm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String pymtseq = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtseq")));
String cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("cnfm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setPymtseq(pymtseq);
dm.setCnfm(cnfm);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sun Oct 03 20:39:16 KST 2004 */