/***************************************************************************************************
* ���ϸ� : PS_L_TACOM_SCHEDM.java
* ��� : ���Ǳ� ���� ��
* �ۼ����� : 2004-02-23
* �ۼ��� : ����ǥ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ps.pbs.share.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.share.ds.*;
import chosun.ciis.ps.pbs.share.rec.*;

/**
 * ���Ǳ� ���� ��
 *
 */


public class PS_S_TACOM_SCHEDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public long seq;
	public String cmpycd;

	public PS_S_TACOM_SCHEDM(){}
	public PS_S_TACOM_SCHEDM(long seq, String cmpycd){
		this.seq = seq;
		this.cmpycd = cmpycd;
	}

	public void setSeq(long seq){
		this.seq = seq;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public long getSeq(){
		return this.seq;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getSQL(){
		 return "{ call SP_PS_S_TACOM_SCHE( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_S_TACOM_SCHEDM dm = (PS_S_TACOM_SCHEDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setLong(3, dm.seq);
		cstmt.setString(4, dm.cmpycd);
		cstmt.registerOutParameter(5, Types.INTEGER);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.share.ds.PS_S_TACOM_SCHEDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String seq = Util.checkString(req.getParameter("seq"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setSeq(seq);
dm.setCmpycd(cmpycd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Feb 23 20:33:12 KST 2004 */