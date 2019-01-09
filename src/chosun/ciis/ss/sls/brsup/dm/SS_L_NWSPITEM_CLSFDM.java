/***************************************************************************************************
* ���ϸ� : SS_L_NWSPITEM_CLSFDM.java
* ��� : ��������-�Ź�������ǰ-��ǰ����� ���� DM
* �ۼ����� : 2004-01-20
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * ��������-�Ź�������ǰ-��ǰ����� ���� DM
 */

public class SS_L_NWSPITEM_CLSFDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String itemclsf;

	public SS_L_NWSPITEM_CLSFDM(){}
	public SS_L_NWSPITEM_CLSFDM(String itemclsf){
		this.itemclsf = itemclsf;
	}

	public void setItemclsf(String itemclsf){
		this.itemclsf = itemclsf;
	}

	public String getItemclsf(){
		return this.itemclsf;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_NWSPITEM_CLSF( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_NWSPITEM_CLSFDM dm = (SS_L_NWSPITEM_CLSFDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.itemclsf);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_NWSPITEM_CLSFDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String itemclsf = req.getParameter("itemclsf");
if( itemclsf == null){
	System.out.println(this.toString+" : itemclsf is null" );
}else{
	System.out.println(this.toString+" : itemclsf is "+itemclsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String itemclsf = Util.checkString(req.getParameter("itemclsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String itemclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("itemclsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setItemclsf(itemclsf);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jan 28 20:45:07 KST 2004 */