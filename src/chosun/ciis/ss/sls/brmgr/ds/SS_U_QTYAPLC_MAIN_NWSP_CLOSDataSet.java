/***************************************************************************************************
* ���ϸ� : SS_U_QTYAPLC_MAIN_NWSP_CLOSDataSet.java
* ��� : �����濵-�μ�����-������û(�μ����)-������ ���� DataSet
* �ۼ����� : 2004-04-24
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * �����濵-�μ�����-������û(�μ����)-������ ���� DataSet
 */

public class SS_U_QTYAPLC_MAIN_NWSP_CLOSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
    public String errcode;
    public String errmsg;

    public SS_U_QTYAPLC_MAIN_NWSP_CLOSDataSet(){}
    public SS_U_QTYAPLC_MAIN_NWSP_CLOSDataSet(String errcode, String errmsg){
        this.errcode = errcode;
        this.errmsg = errmsg;
    }

    public void setErrcode(String errcode){
        this.errcode = errcode;
    }

    public void setErrmsg(String errmsg){
        this.errmsg = errmsg;
    }

    public String getErrcode(){
        return this.errcode;
    }

    public String getErrmsg(){
        return this.errmsg;
    }

    public void getValues(CallableStatement cstmt) throws SQLException{
        this.errcode = Util.checkString(cstmt.getString(1));
        this.errmsg = Util.checkString(cstmt.getString(2));
    }
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
    SS_U_QTYAPLC_MAIN_NWSP_CLOSDataSet ds = (SS_U_QTYAPLC_MAIN_NWSP_CLOSDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jun 03 13:10:05 KST 2004 */
