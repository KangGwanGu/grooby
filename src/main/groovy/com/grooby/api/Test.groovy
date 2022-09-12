package com.grooby.api

import com.grooby.RbmsVo

import java.util.stream.Collectors

class Test {
    static void main(String[] args) {
        List<RbmsVo> list = Arrays.asList(
                new RbmsVo("A0495","1","11664","Y"),
                new RbmsVo("A0495","2","11667","Y"),
                new RbmsVo("A0495","1","11665","N"),
                new RbmsVo("A0495","2","11668","N"),
                new RbmsVo("A0495","3","11670","Y"),
                new RbmsVo("A0495","1","11666","N"),
                new RbmsVo("A0495","3","11671","N"),
                new RbmsVo("A0495","2","11669","N"),
                new RbmsVo("A0495","3","11672","N")
        )

        Map<String, List<RbmsVo>> result = list.stream().collect(Collectors.groupingBy(RbmsVo::getGrpNo)).collect {it.toString()};

//        for (i in 0..< list.size()) {
//            println list.get(i).toString()
//        }

        list.stream()
                .sorted(Comparator.comparing(RbmsVo::getGrpNo)
                    .thenComparing(RbmsVo::getBasePlicdYn, Comparator.naturalOrder()))
                .forEach(System.out::println)


        list = list.stream()
                .sorted(Comparator.comparing(RbmsVo::getGrpNo)
                        .thenComparing(RbmsVo::getBasePlicdYn, Comparator.naturalOrder()))
                .collect(Collectors.toList())

        list = list.stream()
                .sorted(Comparator.comparing(RbmsVo::getGrpNo)
                        .thenComparing(RbmsVo::getBasePlicdYn, Comparator.naturalOrder()))
                .map(Collectors.toList())

        Map<String, List<String>> group = new HashMap<>()
        List<String> plicdList = new ArrayList<>()
        for (i in 0..< list.size()) {
            if(list.get(i).getBasePlicdYn() == "Y") {
                group.put(list.get(i).getPlicd(), plicdList)
                plicdList = new ArrayList<>()
            } else {
                plicdList.add(list.get(i).getPlicd())
            }
        }

        println "========================="

        println group.toString()

//
//        list.forEach((k, v) -> result.computeIfAbsent(v, x -> new ArrayList<>()).add(k))
//
//        list.forEach((k, v) -> result.computeIfAbsent(v, x -> new ArrayList<>()).add(k));


    }
}
