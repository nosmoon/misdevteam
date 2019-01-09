/***************************************************************************************************
* 파일명 : SS_U_QTYAPLC_MAIN_NWSP_CLOSDataSet.java
* 기능 : 지국경영-부수증감-본지신청(부수담당)-저장을 위한 DataSet
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 지국경영-부수증감-본지신청(부수담당)-저장을 위한 DataSet
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
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
    SS_U_QTYAPLC_MAIN_NWSP_CLOSDataSet ds = (SS_U_QTYAPLC_MAIN_NWSP_CLOSDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 03 13:10:05 KST 2004 */
