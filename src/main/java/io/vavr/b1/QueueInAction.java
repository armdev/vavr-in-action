/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.vavr.b1;


import io.vavr.Tuple2;
import io.vavr.collection.Queue;
import io.vavr.control.Option;



/**
 *
 * @author armenar
 */
public class QueueInAction {

    public void queue() {
        Queue<Integer> queue = Queue.of(1, 2, 3)
                .enqueue(4)
                .enqueue(5);

        System.out.println(queue.toArray());

        Tuple2<Integer, Queue<Integer>> dequeued = queue.dequeue();

        System.out.println(dequeued.toSeq());

        Queue.of(1).dequeueOption();

        Queue.empty().dequeueOption();

    }

    public void queueOne() {
        // = Queue(1)
        Queue<Integer> queue = Queue.of(1,2,3);
        System.out.println(queue.toArray());
        // = Some((1, Queue()))
        Option<Tuple2<Integer, Queue<Integer>>> dequeued
                = queue.dequeueOption();
        System.out.println(dequeued.toArray());
        // = Some(1)
        Option<Integer> element = dequeued.map(Tuple2::_1);
        System.out.println(element.toArray());
        // = Some(Queue())
        Option<Queue<Integer>> remaining
                = dequeued.map(Tuple2::_2);
        System.out.println(remaining.toArray());

    }

    public static void main(String args[]) {
        QueueInAction action = new QueueInAction();
        action.queueOne();
    }

}
