/***************************************************************************************************
* ���ϸ� : SS_S_PROMSTAF_CYEXTNDM.java
* ��� : Ȯ����Ȳ-���̹�Ȯ��-�������-�󼼸� ���� DM
* �ۼ����� : 2004-07-24
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * Ȯ����Ȳ-���̹�Ȯ��-�������-�󼼸� ���� DM
 */


public class SS_S_PROMSTAF_CYEXTNDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String stafclsfcd;
	public String stafno;

	public SS_S_PROMSTAF_CYEXTNDM(){}
	public SS_S_PROMSTAF_CYEXTNDM(String stafclsfcd, String stafno){
		this.stafclsfcd = stafclsfcd;
		this.stafno = stafno;
	}

	public void setStafclsfcd(String stafclsfcd){
		this.stafclsfcd = stafclsfcd;
	}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public String getStafclsfcd(){
		return this.stafclsfcd;
	}

	public String getStafno(){
		return this.stafno;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_PROMSTAF_CYEXTN( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_PROMSTAF_CYEXTNDM dm = (SS_S_PROMSTAF_CYEXTNDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.stafclsfcd);
		cstmt.setString(4, dm.stafno);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
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
		cstmt.registerOutParameter(23, Types.VARCHAR);
		cstmt.registerOutParameter(24, Types.VARCHAR);
		cstmt.registerOutParameter(25, Types.VARCHAR);
		cstmt.registerOutParameter(26, Types.VARCHAR);
		cstmt.registerOutParameter(27, Types.VARCHAR);
		cstmt.registerOutParameter(28, Types.VARCHAR);
		cstmt.registerOutParameter(29, Types.VARCHAR);
		cstmt.registerOutParameter(30, Types.VARCHAR);
		cstmt.registerOutParameter(31, Types.VARCHAR);
		cstmt.registerOutParameter(32, Types.VARCHAR);
		cstmt.registerOutParameter(33, Types.VARCHAR);
		cstmt.registerOutParameter(34, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_S_PROMSTAF_CYEXTNDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String stafclsfcd = req.getParameter("stafclsfcd");
if( stafclsfcd == null){
	System.out.println(this.toString+" : stafclsfcd is null" );
}else{
	System.out.println(this.toString+" : stafclsfcd is "+stafclsfcd );
}
String stafno = req.getParameter("stafno");
if( stafno == null){
	System.out.println(this.toString+" : stafno is null" );
}else{
	System.out.println(this.toString+" : stafno is "+stafno );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String stafclsfcd = Util.checkString(req.getParameter("stafclsfcd"));
String stafno = Util.checkString(req.getParameter("stafno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String stafclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("stafclsfcd")));
String stafno = Util.Uni2Ksc(Util.checkString(req.getParameter("stafno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setStafclsfcd(stafclsfcd);
dm.setStafno(stafno);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Aug 05 18:50:51 KST 2004 */