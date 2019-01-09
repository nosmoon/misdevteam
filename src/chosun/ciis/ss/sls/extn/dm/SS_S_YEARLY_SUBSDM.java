/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ������
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
 * 
 */


public class SS_S_YEARLY_SUBSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cpnno;

	public SS_S_YEARLY_SUBSDM(){}
	public SS_S_YEARLY_SUBSDM(String cpnno){
		this.cpnno = cpnno;
	}

	public void setCpnno(String cpnno){
		this.cpnno = cpnno;
	}

	public String getCpnno(){
		return this.cpnno;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_S_YEARLY_SUBS(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_YEARLY_SUBSDM dm = (SS_S_YEARLY_SUBSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cpnno);
		cstmt.registerOutParameter(4, Types.VARCHAR);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.INTEGER);
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
		cstmt.registerOutParameter(19, Types.INTEGER);
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
		cstmt.registerOutParameter(35, Types.VARCHAR);
		cstmt.registerOutParameter(36, Types.VARCHAR);
		cstmt.registerOutParameter(37, Types.VARCHAR);
		cstmt.registerOutParameter(38, Types.VARCHAR);
		cstmt.registerOutParameter(39, Types.VARCHAR);
		cstmt.registerOutParameter(40, Types.VARCHAR);
		cstmt.registerOutParameter(41, Types.VARCHAR);
		cstmt.registerOutParameter(42, Types.VARCHAR);
		cstmt.registerOutParameter(43, Types.VARCHAR);
		cstmt.registerOutParameter(44, Types.VARCHAR);
		cstmt.registerOutParameter(45, Types.VARCHAR);
		cstmt.registerOutParameter(46, Types.VARCHAR);
		cstmt.registerOutParameter(47, Types.VARCHAR);
		cstmt.registerOutParameter(48, Types.VARCHAR);
		cstmt.registerOutParameter(49, Types.VARCHAR);
		cstmt.registerOutParameter(50, Types.VARCHAR);
		cstmt.registerOutParameter(51, Types.VARCHAR);
		cstmt.registerOutParameter(52, Types.VARCHAR);
		cstmt.registerOutParameter(53, Types.VARCHAR);
		cstmt.registerOutParameter(54, Types.VARCHAR);
		cstmt.registerOutParameter(55, Types.VARCHAR);
		cstmt.registerOutParameter(56, Types.INTEGER);
		cstmt.registerOutParameter(57, Types.VARCHAR);
		cstmt.registerOutParameter(58, Types.VARCHAR);
		cstmt.registerOutParameter(59, Types.VARCHAR);
		cstmt.registerOutParameter(60, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_S_YEARLY_SUBSDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cpnno = [" + getCpnno() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cpnno = req.getParameter("cpnno");
if( cpnno == null){
	System.out.println(this.toString+" : cpnno is null" );
}else{
	System.out.println(this.toString+" : cpnno is "+cpnno );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cpnno = Util.checkString(req.getParameter("cpnno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cpnno = Util.Uni2Ksc(Util.checkString(req.getParameter("cpnno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCpnno(cpnno);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jul 28 17:43:49 KST 2015 */