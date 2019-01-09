
var app = angular.module('4100', ['ngAnimate', 'ngTouch', 'ui.grid', 'ui.grid.pinning', 'ui.grid.moveColumns', 'ui.grid.resizeColumns', 'ui.grid.exporter', 'ui.grid.pagination', 'ui.grid.selection']);
/*--------------------------------
//���� ��Ű� �ѱ۱��� ����
app.config(function ($httpProvider,$httpParamSerializerJQLikeProvider){
	$httpProvider.defaults.transformRequest.unshift($httpParamSerializerJQLikeProvider.$get());
});
--------------------------------*/

//kr-input ����:�ѱ��Է½� �ǽð� ���ε� �ǰ� ������ 
app.directive('krInput', ['$parse', function($parse) {
    return {
        priority : 2,
        restrict : 'A',
        compile : function(element) {
            element.on('compositionstart', function(e) {
                e.stopImmediatePropagation();
	            });
        },
    };
}]);


app.controller('ctrl4100', ['$scope', '$http', 'uiGridConstants', 'exportUiGridService', function($scope, $http, uiGridConstants, exportUiGridService ) {
	
	//�ʱⰪ ����
	$scope.title  = "CRUD Sample";
	$scope.code   = {};
	$scope.detail = {};
	$scope.totalcnt = 0;


	//GRID �Ӽ�����
	$scope.gridOptions1 = {
		rowHeight:			26,
		flatEntityAcess:	true,
		fastWatch:			true,
		multiSelect:		true,
		enableSelectAll: 	true,
		enableFullRowSelection:	true,
		selectionRowHeaderWidth: 35,		
		//Filtering
		enableFiltering:	false,
		//Footer
		showGridFooter:		true,
		//Paging
		paginationPageSizes: [10, 15, 20, 50, 80, 100],
		paginationPageSize:	 15,
		//Sort
		enableSorting:		true,
		//Handlers, Template
		appScopeProvider:	{
			onGridDblClick : function(row) {
				$scope.detail.dept_nm = row.entity.dept_nm;
				$scope.detail.part_nm = row.entity.part_nm;
				$scope.detail.area_nm = row.entity.area_nm;
				$scope.detail.bo_cd   = row.entity.bo_cd;
				$scope.detail.bo_nm   = row.entity.bo_nm;
				$scope.detail.bo_seq  = row.entity.bo_seq;
				$scope.detail.qty     = row.entity.qty;
				$scope.detail.uprc    = row.entity.uprc;
				$scope.detail.amt     = row.entity.amt;
				$scope.detail.dept_cd = row.entity.dept_cd;
				$scope.detail.part_cd = row.entity.part_cd;
				$scope.detail.area_cd = row.entity.area_cd;
			}
		},
		rowTemplate:		'<div ng-dblclick="grid.appScope.onGridDblClick(row)" ng-repeat="col in colContainer.renderedColumns track by col.colDef.name" class="ui-grid-cell" ui-grid-cell></div>',
		//Export data
		enableGridMenu:			true,
		exporterMenuPdf:		false,
		exporterMenuCsv:		false,
		//exporterCsvFilename: 	'sample.csv',
	    //exporterCsvLinkElement: angular.element(document.querySelectorAll(".custom-csv-link-location")),
		
		//�׸��忡��  ���� �ٿ�ε� �߰�-����
        gridMenuCustomItems: [
        		{
        			title: '��ü�ڷ� ��������',
            		action: function ($event) {
								exportUiGridService.exportToExcel('sheet 1', $scope.gridApi, 'all', 'all');
                	},
                    order: 110
                },
                {
                    title: '������ �ڷ����� ��������',
                    action: function ($event) {
                        		exportUiGridService.exportToExcel('sheet 1', $scope.gridApi, 'visible', 'visible');
                    },
                    order: 111
                },
                {
                    title: '���ó��� ��������',
                    action: function ($event) {
                        		exportUiGridService.exportToExcel('sheet 1', $scope.gridApi, 'selected', 'visible');
                    },
                    order: 112
                }
		]
	};

	
	//GRID �÷�����
	$scope.gridOptions1.columnDefs = [
			  { name:'��',   		field: 'dept_nm' , 		width:80 },
			  { name:'��Ʈ',   		field: 'part_nm' , 		width:80 }, 
			  { name:'����',     	field: 'area_nm' , 		width:80 }, 
			  { name:'����',  		field: 'bo_nm' , 		width:80 }, 
			  { name:'�����ڵ�', 		field: 'bo_cd' , 		width:80 }, 
			  { name:'����',    		field: 'bo_seq' , 		width:80 }, 
			  { name:'�μ�',			field: 'qty' , 			width:80,  cellFilter: 'number' }, 
  			  { name:'�ܰ�',			field: 'uprc', 			width:80,  cellFilter: 'number' },
			  { name:'�ݾ�',			field: 'amt', 			width:100, cellFilter: 'number' },
			  { name:'dept_cd',		field: 'dept_cd', 		visible: false },
			  { name:'part_cd',		field: 'part_cd', 		visible: false },
			  { name:'area_cd',		field: 'area_cd', 		visible: false }
		]
	;

	//GRID API����
	$scope.gridOptions1.onRegisterApi = function(gridApi) {
      $scope.gridApi = gridApi;
    };


	//�ʱ� �۾� ����
	$http.get("/se/ang/1010").then(function (response) {
        $scope.teamlist = response.data.root.comboSet.teamlist.record;
        $scope.partlist = response.data.root.comboSet.partlist.record;
        $scope.arealist = response.data.root.comboSet.arealist.record;
    });


	//chg1 ���ý� ���� �Լ�
    $scope.chg1 = function() {
    	alert($scope.code.dept_cd);
    };

	//chg2 ���ý� ���� �Լ�    
    $scope.chg2 = function() {
    	alert($scope.code.part_cd);
    };

	//chg3 ���ý� ���� �Լ�
    $scope.chg3 = function() {
    	alert($scope.code.area_cd);
    };
	
	
	//��ȸ ��Ʋ Ŭ�� �� ���� �Լ�
    $scope.search = function() {
		$scope.result = "";	//�ʿ��� ���� �ʱ�ȭ
    	showProgress();	    //progress ������
    	
		$http({
			//�񵿱� POST��� SUBMIT
			method  : 'POST',
			url     : '/se/ang/1020',
			data    : $.param($scope.code),
			headers : { 'Content-Type': 'application/x-www-form-urlencoded' }			
		}).success(function(data, status) {
		    //���� �� ó��
		    $scope.totalcnt = data.root.gridData.totalcnt;
			$scope.result   = data; //.root.gridData.record;
			$scope.gridOptions1.data = data.root.gridData.record;
			
		    if( data.root.gridData.totalcnt == 0 ) {
				alert("no data found");
				$scope.gridOptions1.data = [];
		    }

			hideProgress(); //progress ����
		});
    };

    
	//���� ��ư Ŭ�� �� ���� �Լ�
	$scope.toggleFiltering = function() {
		$scope.gridOptions1.enableFiltering = !$scope.gridOptions1.enableFiltering;
		$scope.gridApi.core.notifyDataChange( uiGridConstants.dataChange.COLUMN );
	};
	
	//Excel ��ư Ŭ�� �� ���� �Լ�
	$scope.excel = function() {
		exportUiGridService.exportToExcel('sheet 1', $scope.gridApi, 'all', 'all');
	};
	
	//Instance ��ư Ŭ�� �� ���� �Լ�
	$scope.toggleInstance = function() {
		$("#textarea1").toggle();
	};
	
	//���õ��ڷ� ��ư Ŭ�� �� ���� �Լ�
	$scope.selectedData = function() {		
		var rows = $scope.gridApi.selection.getSelectedRows();
		var data = "[";
		angular.forEach(rows, function(row, rowkey) {
			data += "{";
			angular.forEach(row, function(colval, colkey) {
				data += "\"" + colkey + "\":\"" + colval + "\",";
			});			
			data += "\":\"},";
		});
		data = data.substring(0, data.length - 1) + "]";
		alert(data);
	};

	//��� ��ư Ŭ�� �� ���� �Լ�	
	$scope.insert = function() {		
		if($scope.detail.bo_cd == null || $scope.detail.bo_nm == null || $scope.detail.bo_seq == null ||
			$scope.detail.bo_cd == "" || $scope.detail.bo_nm == "" || $scope.detail.bo_seq == "" ) {
			alert("��� �� ����� �����ϴ�.");
			return;
		}
		alert("��� �� ��/��Ʈ/������ [CS�Ѱ���/�ؿ�Ư��/�ؿ�] �� �����մϴ�");
		$scope.detail.clsf = "I";
		$scope.process();
	};
	
	//���� ��ư Ŭ�� �� ���� �Լ�
	$scope.update = function() {
		if($scope.detail.bo_cd == "" || $scope.detail.bo_cd == null) {
			alert("���� �� ����� �����ϴ�.");
			return;
		}
		$scope.detail.clsf = "U";
		$scope.process();
	};
	
	//���� ��ư Ŭ�� �� ���� �Լ�
	$scope.delete = function() {
		if($scope.detail.bo_cd == "" || $scope.detail.bo_cd == null) {
			alert("���� �� ����� �����ϴ�.");
			return;
		}
		$scope.detail.clsf = "D";
		$scope.process();
	};
	
	//�ʱ�ȭ ��ư Ŭ�� �� ���� �Լ�
	$scope.init = function() {
		$scope.detail = {};
	};
	
	$scope.process = function() {

		$http({
			//�񵿱� POST��� SUBMIT
			method  : 'POST',
			url     : '/se/ang/1030',
			data    : $.param($scope.detail),
			headers : { 'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8' }
		}).success(function(data, status) {
		    //���� �� ó��
		    alert("complete");
		    $scope.init();
		    $scope.search();
		});
	};
	
}])
;
