(function(){"use strict";var n={5055:function(n,t,e){var o=e(5130),r=e(6768);const u={id:"app"};function i(n,t,e,o,i,a){const c=(0,r.g2)("AppDashboard");return(0,r.uX)(),(0,r.CE)("div",u,[(0,r.bF)(c)])}var a=e(4232);function c(n,t,e,o,u,i){const c=(0,r.g2)("el-card"),l=(0,r.g2)("el-col"),s=(0,r.g2)("el-row");return(0,r.uX)(),(0,r.CE)("div",null,[(0,r.bF)(s,null,{default:(0,r.k6)((()=>[(0,r.bF)(l,{span:12},{default:(0,r.k6)((()=>[(0,r.bF)(c,{shadow:"hover"},{default:(0,r.k6)((()=>[(0,r.Lk)("div",null,"Total Recipes: "+(0,a.v_)(o.recipesCount),1)])),_:1})])),_:1}),(0,r.bF)(l,{span:12},{default:(0,r.k6)((()=>[(0,r.bF)(c,{shadow:"hover"},{default:(0,r.k6)((()=>[(0,r.Lk)("div",null,"Total Ingredients: "+(0,a.v_)(o.ingredientsCount),1)])),_:1})])),_:1})])),_:1})])}var l=e(4373),s=e(144),f={name:"AppDashboard",setup(){const n=(0,s.KR)(0),t=(0,s.KR)(0),e=async()=>{try{const t=await l.A.get("http://localhost:8080/api/recipes/count");n.value=t.data,console.log("Recipes Count:",n.value)}catch(t){console.error("Failed to fetch recipes count:",t)}},o=async()=>{try{const n=await l.A.get("http://localhost:8080/api/ingredients/count");t.value=n.data,console.log("Ingredients Count:",t.value)}catch(n){console.error("Failed to fetch ingredients count:",n)}};return(0,r.sV)((()=>{e(),o()})),{recipesCount:n,ingredientsCount:t}}},d=e(1241);const p=(0,d.A)(f,[["render",c]]);var v=p,h={name:"App",components:{AppDashboard:v}};const b=(0,d.A)(h,[["render",i]]);var g=b,y=(e(4188),e(1938));const w=(0,o.Ef)(g);w.use(y.A),w.mount("#app")}},t={};function e(o){var r=t[o];if(void 0!==r)return r.exports;var u=t[o]={exports:{}};return n[o].call(u.exports,u,u.exports,e),u.exports}e.m=n,function(){var n=[];e.O=function(t,o,r,u){if(!o){var i=1/0;for(s=0;s<n.length;s++){o=n[s][0],r=n[s][1],u=n[s][2];for(var a=!0,c=0;c<o.length;c++)(!1&u||i>=u)&&Object.keys(e.O).every((function(n){return e.O[n](o[c])}))?o.splice(c--,1):(a=!1,u<i&&(i=u));if(a){n.splice(s--,1);var l=r();void 0!==l&&(t=l)}}return t}u=u||0;for(var s=n.length;s>0&&n[s-1][2]>u;s--)n[s]=n[s-1];n[s]=[o,r,u]}}(),function(){e.n=function(n){var t=n&&n.__esModule?function(){return n["default"]}:function(){return n};return e.d(t,{a:t}),t}}(),function(){e.d=function(n,t){for(var o in t)e.o(t,o)&&!e.o(n,o)&&Object.defineProperty(n,o,{enumerable:!0,get:t[o]})}}(),function(){e.g=function(){if("object"===typeof globalThis)return globalThis;try{return this||new Function("return this")()}catch(n){if("object"===typeof window)return window}}()}(),function(){e.o=function(n,t){return Object.prototype.hasOwnProperty.call(n,t)}}(),function(){e.r=function(n){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(n,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(n,"__esModule",{value:!0})}}(),function(){var n={524:0};e.O.j=function(t){return 0===n[t]};var t=function(t,o){var r,u,i=o[0],a=o[1],c=o[2],l=0;if(i.some((function(t){return 0!==n[t]}))){for(r in a)e.o(a,r)&&(e.m[r]=a[r]);if(c)var s=c(e)}for(t&&t(o);l<i.length;l++)u=i[l],e.o(n,u)&&n[u]&&n[u][0](),n[u]=0;return e.O(s)},o=self["webpackChunkfrontend"]=self["webpackChunkfrontend"]||[];o.forEach(t.bind(null,0)),o.push=t.bind(null,o.push.bind(o))}();var o=e.O(void 0,[504],(function(){return e(5055)}));o=e.O(o)})();
//# sourceMappingURL=app.73361cc6.js.map